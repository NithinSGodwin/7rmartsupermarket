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
	
//	@FindBy(xpath="//input[@placeholder='Username']")WebElement usernamefield;
//	@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
//	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signinbutton;
	@FindBy(xpath="//p[text()=\"Category\"]")WebElement categorybutton;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")WebElement newcategorybutton;
	@FindBy(xpath="//input[@id=\"category\"]")WebElement entercategory;
	@FindBy(xpath="//li[@class=\'ms-elem-selectable ms-hover\']")WebElement discount;
	@FindBy(xpath="//input[@name=\'main_img\']")WebElement fileupload;
	@FindBy(xpath="//button[@class=\"btn btn-danger\"]")WebElement savebutton;
	
	@FindBy(xpath="//p[text()=\"Category\"]")WebElement categorybutton2;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchbutton;
	@FindBy(xpath="//input[@class=\"form-control\"]") WebElement searchcoloumn;
	@FindBy(xpath="//button[@class=\"btn btn-danger btn-fix\"]")WebElement searchsubmitbutton;
	
	
	
	
//	public void enterUsername(String username)
//	{
//		usernamefield.sendKeys(username);
//	}
//
//	public void enterPassword(String password)
//	{
//		passwordfield.sendKeys(password);
//	}
//
//	public void clickOnSignInButton()
//	{
//		signinbutton.click();
//	}
//	
	public void clickOnCategoryButton()
	{
		categorybutton.click();
	}
	
	public void clickOnNewCategoryButton()
	{
		newcategorybutton.click();
	}
	
	public void enterCategory()
	{
		entercategory.sendKeys("Maggie");
	}
	
	public void clickOnDiscount()
	{
		discount.click();
	}
	
	public void chooseFile()
	{
		fileupload.sendKeys("\"C:\\Users\\91807\\OneDrive\\maggi-noodles.webp\"");
	}
	
	public void clickOnSaveButton()
	{
		savebutton.click();
	}
	
	public void clickOnCategoryButton2()
	{
		categorybutton2.click();
	}
   
	
	public void clickOnSearchButton()
	
	{
		searchbutton.click();
	}
	
	
	public void enterCategoryName()
	{
		searchcoloumn.sendKeys("cookies");
	}
	
	public void clickOnSearchButton2()
	{
		searchsubmitbutton.click();
	}
}
