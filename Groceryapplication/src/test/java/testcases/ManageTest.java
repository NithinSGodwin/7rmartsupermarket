package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Managenews;

public class ManageTest extends BaseClass{
	Loginpage lp;

  @Test
  public void verifyToSearchNews() throws IOException {
		 lp.loginByExcelData();
		 Managenews news = new Managenews(driver);
		 news.clickOnManageNews();
		 news.clickOnSearchButton();
		 news.enternews();
		 news.clickonSearchButton2();
  }
}
