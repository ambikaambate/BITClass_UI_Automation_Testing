package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyClassSection {
	public MyClassSection(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Workshops']")
	private WebElement workShopFilter;
	@FindBy(xpath="//button[text()='Courses']")
	private WebElement CourseFilter;
	@FindBy(xpath="//button[text()='Past Classes']")
	private WebElement PastClassTab;
	@FindBy(xpath="//button[text()='Upcoming Classes']")
	private WebElement UpComingTab;
	@FindBy(xpath="//button[text()='All Classes']")
	private WebElement AllFilterTab;
	public WebElement getAllFilterTab() {
		return AllFilterTab;
	}
	public WebElement getWorkShopFilter() {
		return workShopFilter;
	}
	public WebElement getCourseFilter() {
		return CourseFilter;
	}
	public WebElement getPastClassTab() {
		return PastClassTab;
	}
	public WebElement getUpComingTab() {
		return UpComingTab;
	}
	@FindBy(xpath="//button[text()='Go to Live Class']")
	private WebElement GoToLiveButton;
	public WebElement getGoToLiveButton() {
		return GoToLiveButton;
	}
	@FindBy(xpath="(//h3[text()='Dance Fitness | Give Yourself a Happy Workout with Body & Cardio Exercises!']/following::div/child::button[text()='Go to Live Class'])[1]")
	private WebElement SubScriptionGoLiveButton;

	public WebElement getSubScriptionGoLiveButton() {
		return SubScriptionGoLiveButton;
	}
	@FindBy(xpath="//span[text()='Renew Now']")
	private WebElement SubRenewButton;

	public WebElement getSubRenewButton() {
		return SubRenewButton;
	}
	@FindBy(xpath="(//button[text()='View Recordings'])[1]")
	private WebElement RecordingButton;
	public WebElement getRecordingButton() {
		return RecordingButton;
	}
}