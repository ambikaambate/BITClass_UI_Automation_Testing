package test.java.MyClasses;

import main.PomPages.HomePage;
import main.PomPages.StudentIdCard;
import org.testng.annotations.Test;

import org.openqa.selenium.Keys;

import org.testng.Reporter;
import test.java.HomePagefunctionalities.SingUp;

public class StudentIDCard extends SingUp {
	@Test
	public static void editIdCard() throws InterruptedException {
		HomePage home = new HomePage(driver);
		driver.navigate().refresh();
		home.getLoginDropDown().click();
		home.getMyClassSection().click();
		StudentIdCard id = new StudentIdCard(driver);
		id.getEditCardButton().click();
		id.getNameTextFiled().sendKeys(Keys.SHIFT, Keys.ARROW_UP, Keys.DELETE, "ambika");
		id.getNameTextFiled().sendKeys(Keys.DELETE,"ambika");
		id.getAgeDropDown().sendKeys(Keys.CLEAR,"25");
		id.getGenderOption().click();
		id.getSearchCity().sendKeys("bengaluru", Keys.ARROW_DOWN, Keys.ENTER);
		id.getWorkProfession().sendKeys("Working Professional", Keys.ARROW_DOWN, Keys.ENTER);
		id.getSaveAndSubmitButton().click();
		id.getCloseButton().click();
		Reporter.log("saved successfully message should displaying successfully",true);	
	}

}