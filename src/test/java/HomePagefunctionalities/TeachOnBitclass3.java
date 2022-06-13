package test.java.HomePagefunctionalities;

import main.PomPages.TeachOnBitclass;
import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TeachOnBitclass3{
	@Test
	public void Launchpad1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bitclass.live/n/launchpad?channel=home_page_search&platform=web");
		driver.manage().window().maximize();
		TeachOnBitclass teach= new TeachOnBitclass(driver);
		teach.getLounchPadButton().click();	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(teach.getFullNameTextFiled())); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements);
		elements.sendKeys("amndjdjjf");
		teach.getNoTextFiled().sendKeys("7787906143");
		teach.getMailTextField().sendKeys("bit@ggggtggg.com");
		teach.getCourseTitleTextAre().sendKeys("fghjjhdhjfgh");
		teach.getCourseDeatailsTextArea().sendKeys("jdfgh hsbdhfghg hgrhghrgf nhdfhdh hsdbfhg");
		teach.getTakeWayTextField().sendKeys("dbfndhfnddjfhghdg");
		teach.getSocialMediaButton().sendKeys("dfkjhgdjkjghd  jhgdfsghj");
		WebElement ckeckbox = teach.getTargetAudienceCheckBox();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ckeckbox);
		WebElement box = teach.getTeachingExperianceRedioButton();
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("arguments[0].click();", box);
		WebElement button = teach.getSubmitButton();
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("arguments[0].click();", button);
		Reporter.log("Teacher Details submitted successfully",true);

	}

}
