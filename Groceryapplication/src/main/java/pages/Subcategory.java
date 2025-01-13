package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcategory {

	public WebDriver driver;
	public Subcategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()=\"Sub Category\"]")WebElement subcategorybutton;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")WebElement resetbutton;
	
	
	@FindBy(xpath="//h1[text()='List Sub Categories']") WebElement subCategorypagetext;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newSubCategoryButton;
	@FindBy(xpath="//h1[text()='Add Sub Category']") WebElement addSubCategoryPage;
	@FindBy(xpath="//select[@id='cat_id']") WebElement selectCategoryOption;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subCategoryfield;
	@FindBy(xpath="//input[@type='file']") WebElement choosefile;
	@FindBy(xpath="//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath="//a[text()='Cancel']") WebElement cancelButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertmessage;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//select[@id='un']") WebElement selectSearchCategoryOption;
	@FindBy(xpath="//input[@name='ut']") WebElement searchSubCategoryField;
	@FindBy(xpath="//button[@name='Search']") WebElement searchOptionButton;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
	
//	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	@FindBy(xpath="//h4[text()='List Sub Categories']") WebElement tabletitle;
	
	
	
	
	
	
	
	public void clickOnSubcategory() {
		subcategorybutton.click();
	}
	
	public void clickOnReset() {
		resetbutton.click();
	}
}
