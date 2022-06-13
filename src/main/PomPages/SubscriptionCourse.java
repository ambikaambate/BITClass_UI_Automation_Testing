package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionCourse {
	public SubscriptionCourse(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[text()='Get started for FREE'])[2]")
	private WebElement getStartedForFree;
	@FindBy(xpath="//button[text()='Click to Book']")
	private WebElement ClickAndBookButton;
	@FindBy(xpath="//button[text()='Done']")
	private WebElement DoneButton;
	@FindBy(xpath="(//button[text()='Click to renew'])[2]")
	private WebElement RenewButton;
	@FindBy(xpath="(//button[text()='Go to live Class'])[2]")
	private WebElement GoToLiveClassButton;
	
	public WebElement getGetStartedForFree() {
		return getStartedForFree;
	}
	public WebElement getClickAndBookButton() {
		return ClickAndBookButton;
	}
	public WebElement getDoneButton() {
		return DoneButton;
	}
	public WebElement getRenewButton() {
		return RenewButton;
	}
	public WebElement getGoToLiveClassButton() {
		return GoToLiveClassButton;
	}
	@FindBy(xpath="(//button[text()='Go to Live Class'])[4]")
	private WebElement SubScriptionGoLiveButton;

	public WebElement getSubScriptionGoLiveButton() {
		return SubScriptionGoLiveButton;
	}
	@FindBy(xpath="//span[text()='Renew Now']")
	private WebElement SubRenewButton;

	public WebElement getSubRenewButton() {
		return SubRenewButton;
	}
}
