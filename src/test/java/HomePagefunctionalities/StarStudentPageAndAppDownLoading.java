package test.java.HomePagefunctionalities;

import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.StartStudentsPageEvents;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StarStudentPageAndAppDownLoading {
	@Test
	public void ClickToStudent() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bitclass.live/");
		driver.manage().window().maximize();
		JavaScriptExcutorutil.jsScrollBy(0, 5000, driver);
		StartStudentsPageEvents student = new StartStudentsPageEvents(driver);
		student.getStarStudentOne().click();
		student.getStudentProfileVideoButton().click();
		Actions action = new Actions(driver);
		action.click().perform();
		student.getStarStudentTwo().click();
		student.getStudentProfileVideoButton().click();
		action.click().perform();
		student.getStarStudentthree().click();
		student.getStudentProfileVideoButton().click();
		action.click().perform();
		student.getStarStudentFour().click();
		student.getStudentProfileVideoButton().click();
		action.click().perform();
		Reporter.log("successfully clicked to star students and app download tabs",true);
 }

}
