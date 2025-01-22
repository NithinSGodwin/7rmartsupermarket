package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText {
	public WebDriver driver;
	public ManageFooterText(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()=\"Manage Footer Text\"]")WebElement footerText;
	@FindBy(xpath="//i[@class=\"fas fa-edit\"]")WebElement editButton;
	@FindBy(xpath="//textarea[@id=\"content\"]")WebElement addressColoumn;
	@FindBy(xpath="//input[@name=\"email\"]")WebElement emailColoumn;
	@FindBy(xpath="//input[@name=\"phone\"]")WebElement phoneColoumn;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement updateButton;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")WebElement alert;
	
	public ManageFooterText clickOnFooterTextButton() {
		footerText.click();
		return this;
	}
	
	public ManageFooterText clickOnEditButton() {
		editButton.click();
		return this;
	}
	
	public ManageFooterText address() {
		addressColoumn.sendKeys("abc street Tnagar");
		return this;
	}
	
	public ManageFooterText email() {
		emailColoumn.sendKeys("abcdefgh@gmail.com");
		return this;
	}
	
	public ManageFooterText phonenumber(){
		phoneColoumn.sendKeys("8523697412");
		return this;
	}
	
	public ManageFooterText ClickOnUpdateButton() {
		updateButton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
	
}
