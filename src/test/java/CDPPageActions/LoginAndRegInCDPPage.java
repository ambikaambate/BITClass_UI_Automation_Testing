package test.java.CDPPageActions;

import java.util.concurrent.TimeUnit;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import main.PomPages.SingUpFlow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndRegInCDPPage implements IAutoConstants {
	@Test
	public void LoginCDPPageAndReg() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get(DEFAULT_URL);
	    driver.manage().window().maximize();
		HomePage home= new HomePage(driver);
		JavaScriptExcutorutil.jsScrollBy(0, 800, driver);
		WebElement regButton=home.getRegisterForFreeButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		SingUpFlow sign = new SingUpFlow(driver);
		sign.getLoginButton().click();
		sign.getMobileNoTextField().sendKeys(DEFAULT_MOBILE_NO1,Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sign.getOtpTextField().sendKeys(DEFAULT_OTP,Keys.ENTER);
		Thread.sleep(500);
		driver.navigate().refresh();
		CDPpageEvents cdp = new CDPpageEvents(driver);
		cdp.getRegisterButton().click();
		cdp.getClickAndContinueButton().click();
	    cdp.getDoneButton().click();
	    JavaScriptExcutorutil.jsScrollBy(0, -1500, driver);			
	    cdp.getGoToLiveButton().click();
		MyClassSection my = new MyClassSection(driver);
		my.getGoToLiveButton().click();
		Reporter.log("user suucesssfully register the free course",true);
	}

}
