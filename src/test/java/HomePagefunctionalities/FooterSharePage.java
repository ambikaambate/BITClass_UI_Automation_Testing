package test.java.HomePagefunctionalities;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.HomePageFooterShareEvents;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterSharePage implements IAutoConstants {
	@Test
	public void ClickOnFooterShare() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(DEFAULT_URL);
		driver.manage().window().maximize();
		JavaScriptExcutorutil.jsScrollBy(0, 8500, driver);
		Thread.sleep(2000);
		HomePageFooterShareEvents footer = new HomePageFooterShareEvents(driver);
		footer.getLinkedInIcon().click();
		footer.getFacebookIcon().click();
		footer.getInstagramIcon().click();
		footer.getTwottericon().click();
		Reporter.log("invited friends from footer",true);

		
	}
}
