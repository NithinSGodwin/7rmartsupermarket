package testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.Managenews;
import constant.Constant;

public class ManagenewsTest extends BaseClass{
	Loginpage lp;
	Homepage hp;
	Managenews mn;
  @Test
  public void verifyToSearchNews() throws IOException {
		 lp.loginByExcelData();
		 hp=lp.loginByExcelData();
		 mn=hp.clickManageNews().clickOnSearchButton().enterNews().clickonSearchButton2();		 
  }
  
  @Test()
	public void verifyUserIsAbleToResetManageNews() throws IOException {
		lp = new Loginpage(driver);
		hp = lp.loginByExcelData();
		mn = hp.clickManageNews().clickOnResetButton();
				
		boolean isAlertLoaded=mn.tableTitleIsDisplayed();
		assertTrue(isAlertLoaded,"");
	}
}
