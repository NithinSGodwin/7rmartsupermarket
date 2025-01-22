package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Generalutility;
import Utilities.Waitutility;

public class ManageUserPage {
	public WebDriver driver;
	Generalutility gu=new Generalutility();
	Waitutility wu=new Waitutility();
	
	public ManageUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newuserbutton;
	@FindBy(xpath="//input[@id='username']")WebElement usernamefield;
    @FindBy(xpath="//input[@id='password']")WebElement passwordfiled;
    @FindBy(xpath="//select[@id='user_type']")WebElement usertypeselect;
    @FindBy(xpath="//button[@name='Create']")WebElement savebutton;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchUserbutton;
    @FindBy(xpath="//input[@id='un']")WebElement searchusername;
    @FindBy(xpath="//select[@id='ut']")WebElement searchusertype;
    @FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
    @FindBy(xpath="//i[@class='fas fa-trash-alt']")WebElement deleteuser;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
    @FindBy(xpath="//center[contains(text(), 'RESULT NOT FOUND')]")WebElement searchresult;
    @FindBy(xpath="//i[@class='icon fas fa-check']")WebElement deletealert;
    
    
    public ManageUserPage clickOnNewButton()
    {
    	newuserbutton.click();
 	   return this;
    }
    
    public ManageUserPage enterusername()
    {
    	usernamefield.sendKeys("rj"+gu.generateCurrentDateAndTime());
    	return this;
    }
    
    public ManageUserPage enterPassword() 
    {
    	passwordfiled.sendKeys("789456");
    	return this;
    }
    
    public ManageUserPage selectUsertype()
    {
 	   gu.selectDropdownWithIndex(usertypeselect, 2);
 	   return this;
 	}
    
    public ManageUserPage clickOnSaveButton()
    {
    	savebutton.click();
    	return this;
    }
    
    public boolean alertMessage() 
	{
		return alertmessage.isDisplayed();
	}
    
    public ManageUserPage searchUser()
    {
    	searchUserbutton.click();
    	return this;
    }
    
    public ManageUserPage entersearchusername()
    {
    	searchusername.sendKeys("karthik");
    	return this;
    }
    
    public ManageUserPage searchselectUsertype()
    {
 	   gu.selectDropdownWithIndex(searchusertype, 1);
 	   return this;   
 	}
    
    public ManageUserPage clickOnSearchButton()
    {
    	searchbutton.click();
    	return this;
    }
    
    public boolean isAlertDisplayed() 
    {
 	   return searchresult.isDisplayed();
    }
    
   
}