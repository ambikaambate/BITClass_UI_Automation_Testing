package main.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUtility {
	WebDriver driver;
	Actions action = new Actions(driver);
	public ActionClassUtility(WebDriver driver) {
		driver=this.driver;
	}
	
	public void clickElement(WebElement element) {
		action.click(element).perform();
	}
	public void moveToElement(WebElement element) {
		action.moveToElement(element).perform();	
	}
	public void moveByoffSet(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element) {
		action.doubleClick(element).perform();
	}
	public void rightClick(WebElement element) {
		action.contextClick(element).perform();
	}

}
