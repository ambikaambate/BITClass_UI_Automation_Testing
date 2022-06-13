package test.java.Sales;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAarohanPage implements IAutoConstants {
	public WebDriver driver;
	@Test
	public void LauchingAarohan() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get(AAROHAN_URL);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	WebDriverUtil util = new WebDriverUtil(driver);
	util.switchToASpecificTitledWindow();
	driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("ambika@bitclass.live",Keys.ENTER);
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("ambikasaggam@96",Keys.ENTER);
	Thread.sleep(1200);
	Reporter.log("user logged in to the application successfully",true);
	}

}
