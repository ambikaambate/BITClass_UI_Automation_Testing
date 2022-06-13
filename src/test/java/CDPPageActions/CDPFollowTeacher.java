package test.java.CDPPageActions;

import java.util.concurrent.TimeUnit;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.HomePage;
import main.PomPages.TeacherProfilePageEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CDPFollowTeacher extends BaseTest {
	@Test
	public void fromCdpFollowTeacher() throws InterruptedException {
		Thread.sleep(500);
		HomePage home = new HomePage(driver);
		WebElement regButton=home.getRegisterForFreeButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		JavaScriptExcutorutil.jsScrollBy(0, 1500, driver);
		driver.findElement(By.xpath("//button[text()='Follow Teacher']")).click();
		driver.findElement(By.xpath("//a[text()='More classes']")).click();
		//driver.findElement(By.xpath("//span[text()='Follow']")).click();
		TeacherProfilePageEvents teacher = new TeacherProfilePageEvents(driver);
		WebElement shareIcon = teacher.getShareButton();
		Actions action = new Actions(driver);
		action.moveToElement(shareIcon).perform();
		teacher.getWhatsAppIcon().click();
		teacher.getFaceBookIcon().click();
		teacher.getTwitterIcon().click();
		teacher.getTelegramIcon().click();
		teacher.getSharelink().click();
		Reporter.log("successfully clicked MORE CLASSES from CDP page",true);
		driver.quit();
		
	}
}