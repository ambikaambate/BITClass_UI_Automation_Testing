package test.java.MyClasses;

import main.GenericUtilities.BaseTest;
import main.PomPages.HomePage;
import main.PomPages.ReferalEvents;
import org.testng.annotations.Test;

import org.testng.Reporter;


public class ReferBitCash extends BaseTest {
	@Test
	public void referBitCash() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.getLoginDropDown().click();
		Reporter.log("Login DropDown Clicked Successfully", true);
		home.getMyClassSection().click();
		Reporter.log("My classes option Clicked Successfully", true);
		ReferalEvents refer = new ReferalEvents(driver);
		refer.getClickToCopyButton().click();
		Thread.sleep(1000);
		Reporter.log("Click TO copy Button Clicked Successfully", true);
		refer.getReferLink().click();
		Thread.sleep(1000);
		Reporter.log("Magic Link Clicked Successfully", true);
		refer.getTransactionslink().click();
		driver.navigate().refresh();
		Reporter.log("Transactionslink Clicked Successfully", true);

	}
}
