package test.java.HomePagefunctionalities;
import main.GenericUtilities.IAutoConstants;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.GenericUtilities.WebDriverUtil;
import main.PomPages.HomePage;
import main.PomPages.TeacherProfilePageEvents;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class clickOnStarTeacher implements IAutoConstants {
	@Test
	public void HomePagefunctionalities() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(DEFAULT_URL);
		driver.manage().window().maximize();
		JavaScriptExcutorutil.jsScrollBy(0, 4500, driver);
		Thread.sleep(1000);
		HomePage home = new HomePage(driver);
		home.getStarTeacherProfile().click();
		WebDriverUtil util = new WebDriverUtil(driver);
		util.switchToASpecificTitledWindow();
		Thread.sleep(500);
		TeacherProfilePageEvents teacher = new TeacherProfilePageEvents(driver);
		WebElement shareIcon = teacher.getShareButton();
		Actions action = new Actions(driver);
		action.moveToElement(shareIcon).perform();
		teacher.getWhatsAppIcon().click();
		teacher.getFaceBookIcon().click();
		teacher.getTwitterIcon().click();
		teacher.getTelegramIcon().click();
		teacher.getSharelink().click();
	    Reporter.log("Cliked Star Teacher from Home page",true);
	}
}
