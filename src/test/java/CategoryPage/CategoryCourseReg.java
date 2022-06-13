package test.java.CategoryPage;

import main.GenericUtilities.BaseTest;
import main.GenericUtilities.JavaScriptExcutorutil;
import main.PomPages.CategoryPageevents;
import main.PomPages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CategoryCourseReg extends BaseTest {
	@Test
	public void FreeCourseReg() {
	/*	WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://staging-next.bitclassdev.com/");
	    driver.manage().window().maximize();
		driver.navigate().refresh();*/
		HomePage home = new HomePage(driver);
		home.getCategoryTab().click();
		CategoryPageevents page = new CategoryPageevents(driver);
		WebElement element = page.getCoursecard();
		JavaScriptExcutorutil.clickElement(element, driver);
		page.getClickToBookButton().click();
        page.getExploreButton().click();
        JavaScriptExcutorutil.jsScrollBy(0, 900, driver);	
	}
}
