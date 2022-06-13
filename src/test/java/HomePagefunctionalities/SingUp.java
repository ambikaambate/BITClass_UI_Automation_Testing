package test.java.HomePagefunctionalities;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import main.GenericUtilities.IAutoConstants;
import main.PomPages.SingUpFlow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SingUp implements IAutoConstants {
	public static WebDriver driver;
	public SingUpFlow flow;
	@Test
	public void SingUpAuthFlow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.bitclass.live/");
	    driver.manage().window().maximize();
		flow = new SingUpFlow(driver);
		flow.getLoginButton().click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		flow.getMobileNoTextField().sendKeys(DEFAULT_MOBILE_NO+ randomInt,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		flow.getOtpTextField().sendKeys(DEFAULT_OTP,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		flow.getUserNameTextField().sendKeys(DEFAULT_USERNAME);
		flow.getEmailTextField().sendKeys(DEFAULT_EMAIL,Keys.ENTER);
		Reporter.log("user sign up  successfully",true);
	
	}

}
