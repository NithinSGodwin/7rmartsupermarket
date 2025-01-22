package testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageUserPage;

public class ManageUserPageTest extends BaseClass{
	Loginpage lp;
	Homepage hp;
	ManageUserPage mup;
  
	
	@Test
  public void verifyIfUserIsAbleToCreateNewAdminUserWithValidDetails() throws IOException
  {
	  lp=new Loginpage(driver);
	  hp= lp.loginByExcelData();
	  mup= hp.clickOnAdminUserButton().clickOnNewButton().enterusername().enterPassword().selectUsertype().clickOnSaveButton();
	
		 boolean isAlertLoaded=mup.alertMessage();
		 assertTrue(isAlertLoaded,"");
  }
  
  
  @Test
  public void verifyIfUserIsAbleToSearchAdminUserWithInvalidUsernameAndUsertype() throws IOException
  {
	  lp=new Loginpage(driver);
	hp= lp.loginByExcelData();
	 
	mup= hp.clickOnAdminUserButton().searchUser().entersearchusername().searchselectUsertype().clickOnSearchButton();
	
	 boolean isAlertLoaded=mup.isAlertDisplayed();
	 assertTrue(isAlertLoaded,"");
	
	  
  }
 
}