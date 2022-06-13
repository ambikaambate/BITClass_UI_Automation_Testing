package test.java.Sales;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coupon implements IAutoConstants {
	@Test
	public void CouponCreation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(AAROHAN_URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ambika@bitclass.live",Keys.ENTER);
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("ambikasaggam@96",Keys.ENTER);
		Thread.sleep(1000);
		WebElement salesTab = driver.findElement(By.xpath("//span[text()='Sales']"));
		Actions action = new Actions(driver);
		driver.navigate().refresh();
		//action.moveToElement(salesTab).click().perform();
	}

}
