package test.java.CourseRegistartion;


import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

public class FullCourseReg extends BaseTest {
	@Test
	public void fullCourseRegistartion() throws InterruptedException {
		HomePage home = new HomePage(driver);
		JavaScriptExcutorutil.jsScrollBy(0, 400, driver);
		WebElement paidButton = home.getJoinForButton();
		JavaScriptExcutorutil.clickElement(paidButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		CDPpageEvents cdp = new CDPpageEvents(driver);
		cdp.getJoinForCourseButton().click();
		cdp.getCouponButton().sendKeys(COUPON);
		cdp.getApplyCouponButton().click();
		cdp.getStateDropDown().click();
		cdp.getStateSelection().click();
		cdp.getPayandBookButton().click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    Reporter.log("user registerd full course successfully",true);
	    
	}
}