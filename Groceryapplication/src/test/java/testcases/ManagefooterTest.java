package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Managefootertext;

public class ManagefooterTest {
	Loginpage lp;

  @Test
  public void verifyEditButtonOnFooterText() throws IOException {
		 lp.loginByExcelData();
	  Managefootertext footer = new Managefootertext(null);
	  footer.clickOnFooterTextButton();
	  footer.clickOnEditButton();
	  footer.address();
	  footer.email();
	  footer.phonenumber();
	  footer.ClickOnUpdateButton();
  }
}
