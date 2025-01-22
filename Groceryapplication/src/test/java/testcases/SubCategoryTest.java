package testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Category;
import pages.Homepage;
import constant.Constant;
import pages.Loginpage;
import pages.SubCategoryPage;

public class SubCategoryTest extends BaseClass{
	Loginpage lp;
	Homepage hp;
	SubCategoryPage sub;
	
	
  @Test(priority=1)
  public void verifyUserIsAbleToAddSubCategoryWithValidDetails() throws IOException {
	  lp = new Loginpage(driver);
	  hp=lp.loginByExcelData();
	  hp=new Homepage(driver);
	  sub= hp.clickSubCategoryButton().clickNewSubCategoryButton().clickSelectCategoryOption().enterSubCategoryField()
			 .clickChoosefile().clickSaveButton();
	  
	  boolean isAlertLoaded=sub.getAlertMessage();
	  assertTrue(isAlertLoaded,""); 
  }
  
  @Test(priority=2)
  public void verifyUserIsAbleToSearchSubCategory() throws IOException{
	  lp = new Loginpage(driver);
	  hp=lp.loginByExcelData();
	  hp=new Homepage(driver);
	  sub= hp.clickSubCategoryButton().clickSearchButton().clickSelectSearchCategoryOption().enterSearchSubCategoryField()
			  .clickSearchOptionButton();
	  
	  boolean isAlertLoaded=sub.checkResult();
	  assertTrue(isAlertLoaded,""); 
  }
  
  @Test(priority=3)
  public void verifyUserIsAbleToResetSubCategory() throws IOException{
	  lp = new Loginpage(driver);
	  hp=lp.loginByExcelData();
	  hp=new Homepage(driver);
	  sub= hp.clickSubCategoryButton().clickResetButton();
	  
	  boolean isAlertLoaded=sub.checkOnTableTitleIsDisplayed();
	  assertTrue(isAlertLoaded,""); 
}

}
