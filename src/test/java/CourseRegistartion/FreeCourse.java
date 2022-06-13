package test.java.CourseRegistartion;
import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import org.testng.annotations.Test;
import org.testng.Reporter;


public class FreeCourse extends BaseTest {
		@Test
		public void  FreeCourseRegistration() throws InterruptedException {
			Thread.sleep(800);
			HomePage home = new HomePage(driver);
			home.getCourseCard().click();
			driver.navigate().refresh();
			WebDriverUtil util = new WebDriverUtil(driver);
			util.switchToASpecificTitledWindow();
		    CDPpageEvents cdp = new CDPpageEvents(driver);
		    cdp.getRegisterButton().click();
		    cdp.getDoneButton().click();
		    JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);
		    Thread.sleep(2000);
			cdp.getGoToLiveButton().click();
			Reporter.log("user succeesfully registerd the free course",true);	
	}
}


