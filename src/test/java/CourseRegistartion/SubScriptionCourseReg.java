package test.java.CourseRegistartion;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.CDPpageEvents;
import main.PomPages.SingUpFlow;
import main.PomPages.SubscriptionCourse;
import org.testng.annotations.Test;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SubScriptionCourseReg implements IAutoConstants {
	public WebDriver driver;
	public WebDriverWait explicitWait;
	@Test
	public void SubScriptionReg() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bitclass.live/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 10);
		SingUpFlow flow = new SingUpFlow(driver);
		flow.getLoginButton().click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		flow.getMobileNoTextField().sendKeys(DEFAULT_MOBILE_NO + randomInt,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		flow.getOtpTextField().sendKeys(DEFAULT_OTP,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		flow.getUserNameTextField().sendKeys(DEFAULT_USERNAME);
		flow.getEmailTextField().sendKeys(DEFAULT_EMAIL,Keys.ENTER);
		Reporter.log("user logged in successfully",true);
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.get(SUBSCRIPTION_COURSE);
		driver.manage().window().maximize();
		SubscriptionCourse course = new SubscriptionCourse(driver);
		course.getGetStartedForFree().click();
		course.getClickAndBookButton().click();
		WebElement button = course.getDoneButton();
		JavaScriptExcutorutil.clickElement(button, driver);
		JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);
		Reporter.log("subscription course successfully registartered",true);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		course.getRenewButton().click();
		CDPpageEvents cdp =new CDPpageEvents(driver);
		cdp.getCouponButton().sendKeys(COUPON);
		cdp.getApplyCouponButton().click();
		cdp.getStateDropDown().click();
		cdp.getStateSelection().click();
		cdp.getPayandBookButton().click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		course.getGoToLiveClassButton().click();
		Reporter.log("successfully registered subscription course",true);
		
	}
}
