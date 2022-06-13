package test.java.HomePagefunctionalities;

import main.GenericUtilities.IAutoConstants;
import main.PomPages.SingUpFlow;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(GenericUtilities.ListenerImplementationClass.class)
public class LoginWithInValidData implements IAutoConstants {
	@Test
	public void invalidLoginData() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-next.bitclassdev.com/");
		driver.manage().window().maximize();
		SingUpFlow sing = new SingUpFlow(driver);
		sing.getLoginButton().click();
		sing.getMobileNoTextField().sendKeys("867jfh89586943",Keys.ENTER);
		Thread.sleep(500);
		sing.getOtpTextField().sendKeys("4634",Keys.ENTER);
		
	}

}
