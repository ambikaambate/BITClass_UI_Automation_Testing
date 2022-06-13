package test.java.HomePagefunctionalities;

import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.HomePageFooterEvents;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterPages implements IAutoConstants {
	@Test
	public void samplez() throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(DEFAULT_URL);
	driver.manage().window().maximize();
	JavaScriptExcutorutil.jsScrollBy(0, 10000, driver);
	HomePageFooterEvents footer = new HomePageFooterEvents(driver);
	footer.getHomeFooter().click();
	Reporter.log("home footer clicked successfully",true);
	driver.navigate().back();
	footer.getAboutFooter().click();
	Reporter.log("About footer clicked successfully",true);
	driver.navigate().back();
	footer.getContactFooter().click();
	Reporter.log("Contact footer clicked successfully",true);
	driver.navigate().back();
	footer.getCareersFooter().click();
	Reporter.log("careers footer clicked successfully",true);
	driver.navigate().back();
	footer.getTaechOnBitclassFooter().click();
	Reporter.log("Teach On Bitclass footer clicked successfully",true);
	driver.navigate().back();
	footer.getBlogFooter().click();
	Reporter.log("blog footer clicked successfully",true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().back();
	footer.getPolicyFooter().click();
	Reporter.log("Policy footer clicked successfully",true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	WebElement termsconditon = footer.getTermsAndConditionFooter();
	JavaScriptExcutorutil.clickElement(termsconditon, driver);
	Reporter.log("Terms and condition footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement faqs = footer.getFAQsFooter();
	JavaScriptExcutorutil.clickElement(faqs, driver);
	Reporter.log("FAQs footer clicked successfully",true);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement arts= footer.getArtsFooter();
	JavaScriptExcutorutil.clickElement(arts, driver);
	Reporter.log("arts footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement music = footer.getMusicFooter();
	JavaScriptExcutorutil.clickElement(music, driver);
	Reporter.log("music footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement dance = footer.getDanceFooter();
	JavaScriptExcutorutil.clickElement(dance, driver);
	Reporter.log("dance footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement crypto = footer.getCryptoFooter();
	JavaScriptExcutorutil.clickElement(crypto, driver);
	Reporter.log("crypto footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement baking = footer.getBakingFooter();
	JavaScriptExcutorutil.clickElement(baking, driver);
	Reporter.log("baking footer clicked successfully",true);
	driver.navigate().back();
	JavaScriptExcutorutil.jsScrollBy(0, 9000, driver);
	WebElement health = footer.getHealthFooter();
	JavaScriptExcutorutil.clickElement(health, driver);
	Reporter.log("health footer clicked successfully",true);
	
	
	}
}
