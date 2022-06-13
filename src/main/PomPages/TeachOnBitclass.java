package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachOnBitclass {
	public TeachOnBitclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//button[text()='Teach on BitClass']")
	private WebElement TeachOnBitclassButton;
	@FindBy(xpath="(//span[text()='Join Launchpad'])[2]")
	private WebElement LounchPadButton;
	@FindBy(xpath="//input[@placeholder='Full Name']")
	private WebElement fullNameTextFiled;
	@FindBy(xpath="//input[@placeholder='Whatsapp Number']")
	private WebElement NoTextFiled;
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement MailTextField;
	@FindBy(xpath="//textarea[@name='course_name']")
	private WebElement courseTitleTextAre;
	@FindBy(xpath="//textarea[@name='course_details.point1']")
	private WebElement CourseDeatailsTextArea;
	@FindBy(xpath="//input[@placeholder='Enter outcome or takeaway']")
	private WebElement TakeWayTextField;
	@FindBy(xpath="//span[text()='Working Professionals']")
	private WebElement TargetAudienceCheckBox;
	@FindBy(xpath="//label[text()='Both (Offline+Online)']")
	private WebElement TeachingExperianceRedioButton;
	@FindBy(xpath="//span[text()='Submit Application']")
	private WebElement SubmitButton;
	@FindBy(xpath="//button[text()='Go Back']")
	private WebElement GoBackButton;
	@FindBy(xpath="//INPUT[@placeholder='Enter your social media link']")
	private WebElement socialMediaButton;
	public WebElement getSocialMediaButton() {
		return socialMediaButton;
	}
	public WebElement getTeachOnBitclassButton() {
		return TeachOnBitclassButton;
	}
	public WebElement getLounchPadButton() {
		return LounchPadButton;
	}
	public WebElement getFullNameTextFiled() {
		return fullNameTextFiled;
	}
	public WebElement getNoTextFiled() {
		return NoTextFiled;
	}
	public WebElement getMailTextField() {
		return MailTextField;
	}
	public WebElement getCourseTitleTextAre() {
		return courseTitleTextAre;
	}
	public WebElement getCourseDeatailsTextArea() {
		return CourseDeatailsTextArea;
	}
	public WebElement getTakeWayTextField() {
		return TakeWayTextField;
	}
	public WebElement getTargetAudienceCheckBox() {
		return TargetAudienceCheckBox;
	}
	public WebElement getTeachingExperianceRedioButton() {
		return TeachingExperianceRedioButton;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public WebElement getGoBackButton() {
		return GoBackButton;
	}
	
}