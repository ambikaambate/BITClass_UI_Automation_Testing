package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherProfileEvents {
	public TeacherProfileEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Switch To Teacher']")
	private WebElement swichToTeacherTab;
	@FindBy(xpath="(//button[@class='ant-btn styles_goLive__2so5g'])[1]")
	private WebElement goToLiveNutton;
	@FindBy(xpath="//p[text()='All Classes']")
	private WebElement AllcourseFilter;
	@FindBy(xpath="//p[text()='Workshops']")
	private WebElement WorkshopsFilter;
	@FindBy(xpath="//p[text()='Full Courses']")
	private WebElement FullCoursesFilter;
	@FindBy(xpath="//div[text()='Upcoming Classes']")
	private WebElement upcomingclassTab;
	@FindBy(xpath="//div[text()='Past Classes']")
	private WebElement pastclassFilter;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	@FindBy(xpath="//button[text()='Click to start teaching']")
	private WebElement clickToStartTeaching;
	
	public WebElement getSwichToTeacherTab() {
		return swichToTeacherTab;
	}
	public WebElement getGoToLiveNutton() {
		return goToLiveNutton;
	}
	public WebElement getAllcourseFilter() {
		return AllcourseFilter;
	}
	public WebElement getWorkshopsFilter() {
		return WorkshopsFilter;
	}
	public WebElement getFullCoursesFilter() {
		return FullCoursesFilter;
	}
	public WebElement getUpcomingclassTab() {
		return upcomingclassTab;
	}
	public WebElement getPastclassFilter() {
		return pastclassFilter;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getClickToStartTeaching() {
		return clickToStartTeaching;
	}
}
