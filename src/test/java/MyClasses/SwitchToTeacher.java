package test.java.MyClasses;

import main.GenericUtilities.IAutoConstants;
import main.PomPages.HomePage;
import main.PomPages.SingUpFlow;
import main.PomPages.TeacherProfileEvents;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToTeacher implements IAutoConstants {
	@Test
	public void teacherPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(DEFAULT_URL);
		driver.manage().window().maximize();
		SingUpFlow singup = new SingUpFlow(driver);
		singup.getLoginButton().click();
		singup.getMobileNoTextField().sendKeys("3333335654");
		singup.getSendOtpButton().click();
		Thread.sleep(800);
		singup.getOtpTextField().sendKeys("2139");
		singup.getSingInButton().click();
		Thread.sleep(800);
		HomePage home = new HomePage(driver);
		home.getLoginDropDown().click();
		Thread.sleep(800);
		home.getMyClassSection().click();
		Thread.sleep(800);
		TeacherProfileEvents teacher = new TeacherProfileEvents(driver);
		teacher.getSwichToTeacherTab().click();
		Thread.sleep(800);
		teacher.getWorkshopsFilter().click();
		Thread.sleep(800);
		teacher.getFullCoursesFilter().click();
		Thread.sleep(800);
		teacher.getAllcourseFilter().click();
		teacher.getUpcomingclassTab().click();
	//	teacher.getPastclassFilter().click();
	//	driver.navigate().refresh();
	//	teacher.getGoToLiveNutton().click();
		Reporter.log("switching to teacher profile",true);
		
	}

}
