package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenews {
	public WebDriver driver;
	public Managenews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()=\"Manage News\"]")WebElement managenews;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")WebElement searchbutton;
	@FindBy(xpath="//input[@class=\"form-control\"]")WebElement searchcoloumn;
	@FindBy(xpath="//button[@class=\"btn btn-danger btn-fix\"]")WebElement searchbutton2;
	
	
	public void clickOnManageNews() {
		managenews.click();
	}
	public void clickOnSearchButton() {
		searchbutton.click();
	}
	public void enternews() {
		searchcoloumn.sendKeys("Manmohansingh died");
	}
	public void clickonSearchButton2() {
		searchbutton2.click();
	}
}
