package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managefootertext {
	public WebDriver driver;
	public Managefootertext(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()=\"Manage Footer Text\"]")WebElement footertext;
	@FindBy(xpath="//i[@class=\"fas fa-edit\"]")WebElement editbutton;
	@FindBy(xpath="//textarea[@id=\"content\"]")WebElement addresscoloumn;
	@FindBy(xpath="//input[@name=\"email\"]")WebElement emailcoloumn;
	@FindBy(xpath="//input[@name=\"phone\"]")WebElement phonecoloumn;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement updatebutton;
	
	public void clickOnFooterTextButton() {
		footertext.click();
	}
	public void clickOnEditButton() {
		editbutton.click();
	}
	public void address() {
		addresscoloumn.sendKeys("abc street Tnagar");
	}
	public void email() {
		emailcoloumn.sendKeys("abc@gmail.com");
	}
	public void phonenumber(){
		phonecoloumn.sendKeys("8523697412");
	}
	public void ClickOnUpdateButton() {
		updatebutton.click();;
	}
}
