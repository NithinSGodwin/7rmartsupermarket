package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homepagetext;
@FindBy(xpath="//p[text()='Sub Category']") WebElement subCatagoryButton;
@FindBy(xpath="//p[text()='Category']") WebElement categoryButton;
@FindBy(xpath="//li//p[text()='Sub Category']") WebElement subCategoryButton;
@FindBy(xpath="//p[text()='Manage News']") WebElement manageNewsButton;
@FindBy(xpath="//p[text()='Manage Footer Text']")WebElement manageFooterTextButton;
@FindBy(xpath="//p[text()='Manage Contact']")WebElement manageContactButton;
@FindBy(xpath="//p[contains(text(), 'Admin Users')]")WebElement adminusersbutton;



public String getHomePageText()
{
	return homepagetext.getText();
}

public Category clickCategoryButton() {
	categoryButton.click();
	return new Category(driver);
}

public SubCategoryPage clickSubCategoryButton() {
	subCategoryButton.click();
	return new SubCategoryPage(driver);
}

public Managenews clickManageNews() {
	manageNewsButton.click();
	return new Managenews(driver);
}

public ManageFooterText clickManageFooterTextButton() {
	manageFooterTextButton.click();
	return new ManageFooterText(driver);
}
public ManageUserPage clickOnAdminUserButton() {
	adminusersbutton.click();
	return new ManageUserPage(driver);
}

}
