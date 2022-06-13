package test.java.HomePagefunctionalities;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnAppDownload implements IAutoConstants {
	@Test
	public void AppDownLaoding() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(DEFAULT_URL);
		driver.manage().window().maximize();
		JavaScriptExcutorutil.jsScrollBy(0, 6000, driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@src='https://media.bitclass.live/image/upload/v1647852588/Assets/googleplay-1_mtfhbq.svg']")).click();
		driver.findElement(By.xpath("//img[@src='https://media.bitclass.live/image/upload/v1647852588/Assets/appstore-1_yrfybf.svg']")).click();
		Thread.sleep(2000);
		
		}
}