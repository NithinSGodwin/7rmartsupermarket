package testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import pages.Category;
import pages.Categorysearch;
import pages.Loginpage;

public class CategoryTest extends BaseClass {
	Loginpage lp;
	
	@Test
	  public void verifyToAddCategory() throws IOException {
		 lp.loginByExcelData();
		 Category category=new Category(driver);
		 category.clickOnCategoryButton();
		 category.clickOnNewCategoryButton();
		 category.enterCategory();
		 category.clickOnDiscount();
		 category.chooseFile();
		 category.clickOnSaveButton();
	  }
	  @Test
	  
	  public void verifyCategorySearch() throws IOException {
			 lp.loginByExcelData();
			 Category cs = new Category(driver);
			 cs.clickOnCategoryButton();
			 cs.clickOnSearchButton();
			 cs.enterCategoryName();
			 cs.clickOnSearchButton2();
	  }
	  
	}