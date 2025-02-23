package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Generalutility {
	
	WebDriver driver;
	public String selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public String selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select object = new Select(element);
		object.selectByIndex(indexNumber);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}
	public void selectDropdownWithVisibleText(WebElement element, String text) {
		Select object = new Select(element);
		object.selectByVisibleText(text);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.click();

	}
	public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
	public void rightClick(WebElement element)
	{ Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
		
	}

	public void doubleClick(WebElement element)
	{Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
		
	}
	public void arrowUP(WebElement element)
	{Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_UP).perform();
	}

	public void arrowDown(WebElement element)
	{Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).perform();
	}

	public void dragAndDrop(WebElement element)
	{Actions actions = new Actions(driver);
	actions.dragAndDrop(element, element);
		
	}
	
	public String generateCurrentDateAndTime() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);

		}

	public void javaScriptExecutor(WebElement element)

	{ JavascriptExecutor obj=(JavascriptExecutor) driver;

	obj.executeScript("window.scrollBy(x,y)", " ");
	obj.executeScript("arguments[0].click();", element);

	obj.executeScript("arguments[0].scrollBy(0,document.body.scrollHeight)");


	}

}