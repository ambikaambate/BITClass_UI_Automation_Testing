package test.java.HomePagefunctionalities;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
public class HomePageBanners extends BaseTest {
	@Test
	public void samplez() throws InterruptedException  {
	HomePage home = new HomePage(driver);
	home.getHomePageBanner().click();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	WebDriverUtil util = new WebDriverUtil(driver);
	util.switchToASpecificTitledWindow();
    CDPpageEvents cdp = new CDPpageEvents(driver);
    cdp.getRegisterButton().click();
    cdp.getClickAndContinueButton().click();
    cdp.getDoneButton().click();
    JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);
	cdp.getGoToLiveButton().click();
	MyClassSection my = new MyClassSection(driver);
	my.getGoToLiveButton().click();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	Reporter.log("HomePage Banners cliked  and registered suucesssfully",true);

	}
	
}