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

public class Content_ops implements IAutoConstants {
	@Test
	public void content_ops() throws InterruptedException{
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
	WebDriverUtil uti2l = new WebDriverUtil(driver);
	uti2l.switchToASpecificTitledWindow();
	Thread.sleep(1000);
	WebElement tab = driver.findElement(By.xpath("//span[text()='Content-Ops']"));
	Actions action = new Actions(driver);
	action.click(tab).perform();
	Thread.sleep(1000);
	
	}

}
