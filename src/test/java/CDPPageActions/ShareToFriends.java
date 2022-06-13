package test.java.CDPPageActions;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.ShareEvents;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShareToFriends extends BaseTest {
	@Test
	public void shareFreinds() throws InterruptedException{
		HomePage home = new HomePage(driver);
		WebElement regButton=home.getRegisterForFreeButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		CDPpageEvents cdp = new CDPpageEvents(driver);
		cdp.getCDPVideo().click();
		JavaScriptExcutorutil.jsScrollBy(0, 600, driver);
		ShareEvents share = new ShareEvents(driver);
		WebElement button = share.getInviteButton();
		JavaScriptExcutorutil.clickElement(button, driver);
		share.getWhatsupIcon().click();
	    share.getTwitterIcon().click();
		share.getTelegramicon().click();
		share.getFacebookIcon().click();
		share.getShareLink().click();
		Reporter.log("susscessfully invited to the friendS",true);
		
	}

}


