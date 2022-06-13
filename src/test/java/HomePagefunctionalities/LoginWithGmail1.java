package test.java.HomePagefunctionalities;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.LoginWithGmail;
import main.PomPages.SingUpFlow;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.Set;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithGmail1{
	@Test
	public void LoginWithEmail() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.bitclass.live/");
    driver.manage().window().maximize();
	SingUpFlow singup = new SingUpFlow(driver);
	singup.getLoginButton().click();
	LoginWithGmail login = new LoginWithGmail(driver);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(login.getGoogleButton()));
	Thread.sleep(500);
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements);
	Thread.sleep(500);
	login.getGoogleButton().click();
	WebDriverUtil wind = new WebDriverUtil(driver);
	Thread.sleep(1000);
	wind.switchToASpecificTitledWindow();
	Thread.sleep(1000);
	login.getEmailTextFiled().sendKeys("ambika@bitclass.live");
	login.getNextButton().click();
	Thread.sleep(1200);
 	login.getPwdTextFiled().sendKeys("ambikasaggam@96", Keys.ENTER);
 	Thread.sleep(1000);
    Reporter.log("user successfully singed in bitclass with gmail",true);
	}
	
}
