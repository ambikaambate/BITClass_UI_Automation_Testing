package test.java.MyClasses;



import main.GenericUtilities.BaseTest;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import main.PomPages.ReferalEvents;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class MyClassPageActions  extends BaseTest {
	@Test
	public void myclassss() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.getLoginDropDown().click();
		home.getMyClassSection().click();
		MyClassSection myclass = new MyClassSection(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ReferalEvents refer = new ReferalEvents(driver);
		refer.getClickToCopyButton().click();
		Thread.sleep(1000);
		Reporter.log("Click TO copy Button Clicked Successfully", true);
		refer.getReferLink().click();
		Thread.sleep(1000);
		Reporter.log("Magic Link Clicked Successfully", true);
		refer.getTransactionslink().click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		myclass.getUpComingTab().click();
		myclass.getPastClassTab().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		myclass.getUpComingTab().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		myclass.getWorkShopFilter().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		myclass.getCourseFilter().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		myclass.getAllFilterTab().click();
		myclass.getUpComingTab().click();
		driver.manage().timeouts().implicitlyWait(02, TimeUnit.MINUTES);
		myclass.getRecordingButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		Reporter.log("My class every thing is working good",true);
	}

}
