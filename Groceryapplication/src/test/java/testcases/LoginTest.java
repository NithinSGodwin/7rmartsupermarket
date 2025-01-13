package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Loginpage;

public class LoginTest extends BaseClass{
@Test(retryAnalyzer=retry.Retry.class)
	  public void loginWithValidCredentials() throws IOException {
		  
		  
		  Loginpage login=new  Loginpage(driver);
		  login.loginByExcelData();
		  boolean actualresult=login.ishomePagedDisplayed();
		  boolean expectedresult=true;
		  Assert.assertEquals(expectedresult, actualresult,Constant.lp_verifyloginwithvalidcredentials);
	  }

	@Test
	public void loginWithInvalidUsernameAndValidPassword(String username,String password)
	{
		Loginpage login=new Loginpage(driver);
		  
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickOnSignInButton();
		  
		  boolean expectedresult=false;
		  boolean actualresult=login.getalertmessage().contains("Invalid Username/Password");
		  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");
	}
	@DataProvider(name="data provider")
	public Object[][] dpmethod() 
	{
		  return new Object[][] {{"admin1","admin"},{"admin2","admin"},{"admin3","admin"}};
	}
	
	@Test(dataProvider="data provider1")
	public void loginWithValidUsernameAndInvalidPassword(String username,String password)
	{
		Loginpage login=new Loginpage(driver);	  
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickOnSignInButton();
		  
		  boolean expectedresult=true;
		  boolean actualresult=login.getalertmessage().contains("Invalid Username/Password");
		  
		  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");
	
	}
	@DataProvider(name="data provider1")
	public Object[][] dpmethod1() 
	{
		  return new Object[][] {{"admin","admin12"},{"admin","admin23"},{"admin","admin"}};
	}
	
	@Test(dataProvider="data provider2")
	public void loginWithInValidUsernameAndInvalidPassword(String username,String password)
	{
		Loginpage login=new Loginpage(driver);	  
		  
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickOnSignInButton();
		  
		  boolean expectedresult=true;
		  boolean actualresult=login.getalertmessage().contains("Invalid Username/Password");
		  
		  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");
	
	}
	@DataProvider(name="data provider2")
	public Object[][] dpmethod2() 
	{
		  return new Object[][] {{"admin1","admin12"},{"admin1","admin23"},{"admin3","admin3"}};
	}
	
	}

