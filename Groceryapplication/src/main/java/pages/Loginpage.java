package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Excelutility;

public class Loginpage {

	public WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@placeholder='Username']")WebElement usernamefield;
@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signinbutton;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") 
WebElement alertmessage;
WebElement homepage;
public void enterUsername(String username)
{
	usernamefield.sendKeys(username);
}

public void enterPassword(String password)
{
	passwordfield.sendKeys(password);
}

public void clickOnSignInButton()
{
	signinbutton.click();
}
public boolean ishomePagedDisplayed()
{
	return homepage.isDisplayed();
}
public void loginByExcelData() throws IOException
{
	String username = Excelutility.readStringData(1, 0, "Sheet1");
	String password = Excelutility.readStringData(1, 1, "Sheet1");
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	signinbutton.click();
}
public String getalertmessage()
{
	return alertmessage.getText();
}

}
