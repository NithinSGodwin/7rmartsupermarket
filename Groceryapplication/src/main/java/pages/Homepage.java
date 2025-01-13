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

public String getHomePageText()
{
	return homepagetext.getText();
}
public void Category clickCategoryButton() {
	categoryButton.click();
}
public void clickSubCategoryButton() {
	subCategoryButton.click();
}
}
