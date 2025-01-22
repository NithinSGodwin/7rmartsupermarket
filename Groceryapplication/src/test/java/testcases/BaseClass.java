package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import Utilities.Screenshotutility;
import Utilities.Waitutility;

public class BaseClass {
	Properties prop;
	FileInputStream fs;
	Waitutility waitutilities=new Waitutility();
	
	public WebDriver driver;
	
  @BeforeMethod(alwaysRun=true)
  @Parameters("browser")
  public void initializeBrowser(String browser) throws Exception {
	  
	  prop=new Properties();
		fs=new FileInputStream(Constant.CONFIGFILE);
		prop.load(fs);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid browser");
		}
		 
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 waitutilities.implicitWait(driver);
  }

  @AfterMethod(alwaysRun=true)
  public void driverQuit(ITestResult itestresult) throws IOException {
	  
	 if(itestresult.getStatus()==ITestResult.FAILURE)
		{
			Screenshotutility screenshot=new Screenshotutility();
			screenshot.getScreenShot(driver,itestresult.getName());
		}
  }
  
  //driver.quit();
}

