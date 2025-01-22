package testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.ManageFooterText;

public class ManagefooterTest {
	Loginpage lp;
	Homepage hp;
	ManageFooterText mft;
  @Test
  public void verifyEditButtonOnFooterText() throws IOException {
		 lp.loginByExcelData();
		 hp=lp.loginByExcelData();
		 mft=hp.clickManageFooterTextButton().clickOnEditButton().address().email().phonenumber().ClickOnUpdateButton();
		 
		 boolean isAlertLoaded=mft.isAlertDisplayed();
		 assertTrue(isAlertLoaded,"");
  }
}
