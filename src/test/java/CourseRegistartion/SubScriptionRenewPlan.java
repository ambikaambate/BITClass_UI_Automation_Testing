package test.java.CourseRegistartion;

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

public class SubScriptionRenewPlan implements IAutoConstants {
	@Test
	public void renewSubScriptionPlan() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bitclass.live/");
		driver.manage().window().maximize();
		SingUpFlow sign = new SingUpFlow(driver);
		sign.getLoginButton().click();
		sign.getMobileNoTextField().sendKeys("3333335656",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sign.getOtpTextField().sendKeys("2139",Keys.ENTER);
		Thread.sleep(1000);
		driver.get(SUBSCRIPTION_COURSE);
		HomePage home = new HomePage(driver);
		home.getLoginDropDown().click();
		home.getMyClassSection().click();
		MyClassSection myclass = new MyClassSection(driver);
		myclass.getUpComingTab().click();
		myclass.getAllFilterTab().click();
		myclass.getUpComingTab().click();
		JavaScriptExcutorutil.jsScrollBy(0, 1000, driver);
		WebElement button = myclass.getSubScriptionGoLiveButton();
		JavaScriptExcutorutil.clickElement(button, driver);
		driver.navigate().refresh();
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		myclass.getSubRenewButton().click();
		CDPpageEvents cdp =new CDPpageEvents(driver);
		cdp.getCouponButton().sendKeys(COUPON);
     	cdp.getApplyCouponButton().click();
		cdp.getStateDropDown().click();
		cdp.getStateSelection().click();
	    cdp.getPayandBookButton().click();
	    Reporter.log("user successfully renewd subscription plan",true);
	    
	}
}
