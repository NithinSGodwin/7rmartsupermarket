package testcases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Category;
import pages.Homepage;
import pages.Loginpage;

public class CategoryTest extends BaseClass {
	Loginpage lp;
	Category cat;
	Homepage hp;
	
	@Test(description="")
	  public void verifyToAddCategory() throws IOException {
		 lp=new Loginpage(driver);
		 hp=lp.loginByExcelData();
		 cat=hp.clickCategoryButton().clickOnNewCategoryButton().enterCategory().clickOnDiscount().chooseFile().clickOnSaveButton();
		 
		 boolean isAlertLoaded=cat.isAlertDisplayed();
		 assertTrue(isAlertLoaded,"");
	  }
	
	  @Test  
	  public void verifyCategorySearch() throws IOException {
			 lp.loginByExcelData();
			 hp=lp.loginByExcelData();
			 cat=hp.clickCategoryButton().clickOnSearchButton().enterCategoryName().clickOnSearchButton2();
			 
			 boolean isAlertLoaded=cat.checkOnResultMessage();
			 assertTrue(isAlertLoaded,"");
	  }
	  
	}