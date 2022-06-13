package test.java.CourseRegistartion;


import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class TMPRCourse extends BaseTest {
	@Test 
	public void TMPRreg() throws InterruptedException {
		HomePage home = new HomePage(driver);
		JavaScriptExcutorutil.jsScrollBy(0, 800, driver);
		WebElement regButton=home.getRegisterForFreeButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
	    CDPpageEvents cdp = new CDPpageEvents(driver);
	    cdp.getRegisterButton().click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    cdp.getClickAndContinueButton().click();
	    cdp.getDoneButton().click();
	    JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);
		cdp.getGoToLiveButton().click();
		MyClassSection my = new MyClassSection(driver);
		my.getGoToLiveButton().click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("user suucesssfully register the free course",true);
		
	}
}