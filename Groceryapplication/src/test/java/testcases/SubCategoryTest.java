package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Category;
import pages.Loginpage;
import pages.Subcategory;

public class SubCategoryTest extends BaseClass {
	Loginpage lp;
	Category cp;


  @Test
  public void verifyResetButton() throws IOException {
		 lp.loginByExcelData();
		 Subcategory reset = new Subcategory(driver);
		 reset.clickOnSubcategory();
		 reset.clickOnReset();
  }
}
