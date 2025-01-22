package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {

	public WebDriver driver;
	public Category(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="p[text()='Category']")WebElement categorybutton;
	@FindBy(xpath="a[@class='btn btn-rounded btn-danger']")WebElement newcategorybutton;
	@FindBy(xpath="input[@id='category']")WebElement entercategory;
	@FindBy(xpath="li[@class='ms-elem-selectable ms-hover']")WebElement discount;
	@FindBy(xpath="input[@name='main_img']")WebElement fileupload;
	@FindBy(xpath="button[@class='btn btn-danger']")WebElement savebutton;
	@FindBy(xpath="i[@class='icon fas fa-check']")WebElement alert;
	
	@FindBy(xpath="p[text()='Category']")WebElement categorybutton2;
	@FindBy(xpath="a[@class='btn btn-rounded btn-primary']")WebElement searchbutton;
	@FindBy(xpath="input[@class='form-control']") WebElement searchcoloumn;
	@FindBy(xpath="button[@class='btn btn-danger btn-fix']")WebElement searchsubmitbutton;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;	
	
//	public Category clickOnCategoryButton()
//	{
//		categorybutton.click();
//		return this;
//	}
	
	public Category clickOnNewCategoryButton()
	{
		newcategorybutton.click();
		return this;
	}
	
	public Category enterCategory()
	{
		entercategory.sendKeys("Maggie");
		return this;
	}
	
	public Category clickOnDiscount()
	{
		discount.click();
		return this;
	}
	
	public Category chooseFile()
	{
		fileupload.sendKeys("C:\\Users\\91807\\OneDrive\\maggi-noodles.webp");
		return this;
	}
	
	public Category clickOnSaveButton()
	{
		savebutton.click();
		return this;
	}
	
	public Category clickOnCategoryButton2()
	{
		categorybutton2.click();
		return this;
	}
   
	public Category clickOnSearchButton()
	{
		searchbutton.click();
		return this;
	}
	
	
	public Category enterCategoryName()
	{
		searchcoloumn.sendKeys("cookies");
		return this;
	}
	
	public Category clickOnSearchButton2()
	{
		searchsubmitbutton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
	
	public boolean checkOnResultMessage() {
		return resultNotFoundMessage.isDisplayed();
	}
}
