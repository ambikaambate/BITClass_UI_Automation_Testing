package test.java.HomePagefunctionalities;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.HomePage;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;


public class LiveClasses extends BaseTest {
	@Test
	public void attendLiveClasses() {
		HomePage home = new HomePage(driver);
		WebElement regButton=home.getAttendNowButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
	
	}
}
