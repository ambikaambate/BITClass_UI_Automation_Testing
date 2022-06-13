package test.java.HomePagefunctionalities;

import java.util.concurrent.TimeUnit;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SeachCourses extends BaseTest {
	@Test
	public void searchcourseee() throws InterruptedException {
		
		HomePage home = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		home.getSearchBar().sendKeys("Wedding Photography");
	    home.getWorkshopFilterTab().click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		home.getCoursecardfromsearchpage().click();
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		CDPpageEvents cdp = new CDPpageEvents(driver);
		cdp.getRegisterButton().click();
		cdp.getSlotSection().click();
		cdp.getClickAndContinueButton().click();
		cdp.getDoneButton().click();
	    JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);
		cdp.getGoToLiveButton().click();
		MyClassSection clas = new MyClassSection(driver);
		clas.getPastClassTab().click();
		clas.getUpComingTab().click();
		clas.getGoToLiveButton().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Reporter.log("Registered COurse suucessfully(from search bar)",true);
	}

}
