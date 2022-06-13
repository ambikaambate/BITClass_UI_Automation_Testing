package main.GenericUtilities;

import java.util.concurrent.TimeUnit;

import main.PomPages.SingUpFlow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements IAutoConstants {
	public static WebDriver driver;
	public WebDriverWait explicitWait;
	public SingUpFlow flow;

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void openApplication(@Optional("chrome")String browserName) throws InterruptedException {
		//check
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("successfully Lauching the Chrome Broswer",true);
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 10);
		
		//Step1 : navigate to applications
		driver.get(DEFAULT_URL);
		String expectedPage = "Search live courses | Bitclass";
		Assert.assertEquals(driver.getTitle(), expectedPage , "Bitclass Home Page not displayng successfully");
		Reporter.log("Bitclass home page displaying successfully",true);
	}
		
		@BeforeMethod(alwaysRun=true)
		public void LoginToTheApplication() throws InterruptedException {
			SingUpFlow flow = new SingUpFlow(driver);
			flow.getLoginButton().click();
			flow.getMobileNoTextField().sendKeys(DEFAULT_MOBILE_NO1,Keys.ENTER);
			flow.getOtpTextField().sendKeys(DEFAULT_OTP,Keys.ENTER);
			Reporter.log("user logged in successfully",true);
			Thread.sleep(2000);
		
	}
	/*@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		Reporter.log("Logged out successfully",true);
	}
    //to quit browser
	@AfterClass(alwaysRun=true)
	public void CloseApp() {
	driver.quit();	
	}*/
}



