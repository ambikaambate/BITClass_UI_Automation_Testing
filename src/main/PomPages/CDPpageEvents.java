package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CDPpageEvents {
	public CDPpageEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="(//button[text()='Register for FREE'])[2]")
	private WebElement RegisterButton;
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement DoneButton;

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public WebElement getDoneButton() {
		return DoneButton;
	}
	@FindBy(xpath="(//button[text()='Go to LIVE Class'])[2]")
	private WebElement GoToLiveButton;

	public WebElement getGoToLiveButton() {
		return GoToLiveButton;
	}
	@FindBy(xpath="(//div[@class='styles_scheduleContainer__jLO9t'])[2]")
	private WebElement slotSection;
	@FindBy(xpath="//button[contains(text(),'Choose & Continue')]")
	private WebElement clickAndContinueButton;
	

	public WebElement getSlotSection() {
		return slotSection;
	}

	public WebElement getClickAndContinueButton() {
		return clickAndContinueButton;
	}
	@FindBy(xpath="(//button[contains(text(),'Join this course for')])[2]")
	private WebElement JoinForCourseButton;
	
	@FindBy(xpath="//input[@id='outlined-basic']")
	private WebElement CouponButton;
	
	@FindBy(xpath="//div[@id='state-select']")
	private WebElement stateDropDown;
	
	public WebElement getJoinForCourseButton() {
		return JoinForCourseButton;
	}

	public WebElement getCouponButton() {
		return CouponButton;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getStateSelection() {
		return stateSelection;
	}

	public WebElement getPayandBookButton() {
		return PayandBookButton;
	}

	public WebElement getPayOption() {
		return PayOption;
	}

	public WebElement getBankNameButton() {
		return BankNameButton;
	}

	public WebElement getPayButton() {
		return payButton;
	}

	public WebElement getSuccessButton() {
		return SuccessButton;
	}

	public WebElement getApplyCouponButton() {
		return applyCouponButton;
	}

	@FindBy(xpath="//li[text()='Goa']")
	private WebElement stateSelection;
	
	@FindBy(xpath="//button[text()='Pay and Book']")
	private WebElement PayandBookButton;
		
	@FindBy(xpath="((//div[@class='svelte-ezinrw'])[5]")
	private WebElement PayOption;
	
	@FindBy(xpath="//div[text()='SBI']")
	private WebElement BankNameButton;
	
	@FindBy(xpath="//span[@id='footer-cta']")
	private WebElement payButton;
	
	@FindBy(xpath="//button[text()='Success']")
	private WebElement SuccessButton;
	
	public WebElement getEmailTextFiled() {
		return emailTextFiled;
	}

	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applyCouponButton;
	@FindBy(xpath="//div[@class='email-field']")
	private WebElement emailTextFiled;
	@FindBy(xpath="//span[@id='footer-cta']")
	private WebElement ProceedButton;

	public WebElement getProceedButton() {
		return ProceedButton;
	}
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement cdpLoginButton;

	public WebElement getCdpLoginButton() {
		return cdpLoginButton;
	}
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement CDPMobileNoTextField;
	public WebElement getCDPVideo() {
		return CDPVideo;
	}

	@FindBy(xpath="//input[@type='number']")
	private WebElement CDPOtpTextField;
	@FindBy(xpath="//input[@name='userName']")
	private WebElement CDPUserNameTextField;

	public WebElement getCDPMobileNoTextField() {
		return CDPMobileNoTextField;
	}

	public WebElement getCDPOtpTextField() {
		return CDPOtpTextField;
	}

	public WebElement getCDPUserNameTextField() {
		return CDPUserNameTextField;
	}
	@FindBy(xpath="//div[@class='styles_image_container__X0XhZ']")
	private WebElement CDPVideo;
}
