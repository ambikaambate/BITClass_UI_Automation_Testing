package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartStudentsPageEvents {
	public StartStudentsPageEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='styles_avatarImg__iekjb'])[1]")
	private WebElement starStudentOne;
	@FindBy(xpath="(//span[@class='styles_avatarImg__iekjb'])[2]")
	private WebElement starStudentTwo;
	@FindBy(xpath="(//span[@class='styles_avatarImg__iekjb'])[3]")
	private WebElement starStudentthree;
	@FindBy(xpath="(//span[@class='styles_avatarImg__iekjb'])[4]")
	private WebElement starStudentFour;
	@FindBy(xpath="//div[@class='styles_playIcon__pXdfG']")
	private WebElement StudentProfileVideoButton;
	public WebElement getStarStudentOne() {
		return starStudentOne;
	}
	public WebElement getStarStudentTwo() {
		return starStudentTwo;
	}
	public WebElement getStarStudentthree() {
		return starStudentthree;
	}
	public WebElement getStarStudentFour() {
		return starStudentFour;
	}
	public WebElement getStudentProfileVideoButton() {
		return StudentProfileVideoButton;
	}
}
