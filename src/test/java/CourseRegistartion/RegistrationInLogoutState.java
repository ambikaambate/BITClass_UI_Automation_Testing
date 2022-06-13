package test.java.CourseRegistartion;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.CDPpageEvents;
import main.PomPages.HomePage;
import main.PomPages.MyClassSection;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationInLogoutState implements IAutoConstants {
	@Test
	public void Reg() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(DEFAULT_URL);
		driver.manage().window().maximize();
		HomePage home = new HomePage(driver);
		JavaScriptExcutorutil.jsScrollBy(0, 800, driver);
		WebElement regButton=home.getRegisterForFreeButton();
		JavaScriptExcutorutil.clickElement(regButton, driver);
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
	    CDPpageEvents cdp = new CDPpageEvents(driver);
	    cdp.getRegisterButton().click();
	    cdp.getClickAndContinueButton().click();
	    Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
	    cdp.getCDPMobileNoTextField().sendKeys(DEFAULT_MOBILE_NO + randomInt,Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    cdp.getCDPOtpTextField().sendKeys(DEFAULT_OTP,Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    cdp.getCDPUserNameTextField().sendKeys(DEFAULT_USERNAME,Keys.ENTER);
	    driver.navigate().refresh();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    cdp.getGoToLiveButton().click();
	    MyClassSection myclass= new MyClassSection(driver);
	    myclass.getAllFilterTab().click();
	    myclass.getUpComingTab().click();
		Reporter.log("user suucesssfully register the free course",true);
	}
}
