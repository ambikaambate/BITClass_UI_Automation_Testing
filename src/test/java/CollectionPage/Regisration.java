package test.java.CollectionPage;

import java.util.Random;

import main.GenericUtilities.IAutoConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Regisration implements IAutoConstants {
	@Test
	public void CollectionCourseRegistration() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://staging-next.bitclassdev.com/live-classes/collection/Testing-banner-course");
		//driver.manage().window().maximize();
	    driver.get(Collection_Page_Url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='login']")).click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(DEFAULT_MOBILE_NO + randomInt,Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1971",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ambika",Keys.ENTER);
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		WebElement button =  driver.findElement(By.xpath("(//div[@class='styles_overlay__cy2xH'])[1]"));
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
	    javaScript.executeScript("arguments[0].click();", button);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Click to Book']")).click();
	    Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Explore More']")).click();
		JavascriptExecutor javaScript1 = (JavascriptExecutor) driver;
		javaScript1.executeScript("window.scrollBy(0,500)");
		Reporter.log("useer successfully register the course from collection page",true);
		}	
}
