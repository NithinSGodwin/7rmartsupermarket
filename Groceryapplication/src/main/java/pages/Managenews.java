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
	@FindBy(xpath = "//a[text()=' Reset']")WebElement resetButton;
	@FindBy(xpath = "//h4[text()='Manage News']")WebElement tableTitle;
	
	public Managenews clickOnManageNews() {
		managenews.click();
		return this;
	}
	
	public Managenews clickOnSearchButton() {
		searchbutton.click();
		return this;
	}
	
	public Managenews enterNews() {
		searchcoloumn.sendKeys("Manmohansingh died");
		return this;
	}
	
	public Managenews clickonSearchButton2() {
		searchbutton2.click();
		return this;
	}
	
	public Managenews clickOnResetButton() {
		resetButton.click();
		return this;
	}
	
	public boolean tableTitleIsDisplayed() {
		return tableTitle.isDisplayed();
	}
}
