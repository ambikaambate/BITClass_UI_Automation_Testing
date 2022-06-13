package test.java.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class collectionPage extends OpenAarohanPage{
	@Test
	public void OpenCollectionPage() throws InterruptedException {
		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@aria-label='container']")))); 
		//Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements);
		elements.click();
		
	}

}
