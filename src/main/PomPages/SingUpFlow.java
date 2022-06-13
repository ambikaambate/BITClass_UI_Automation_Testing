package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpFlow {
	public SingUpFlow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//button[text()='login']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement MobileNoTextField;
	
	@FindBy(xpath="//button[text()='Send OTP']")
	private WebElement SendOtpButton;
	
	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getMobileNoTextField() {
		return MobileNoTextField;
	}

	public WebElement getSendOtpButton() {
		return SendOtpButton;
	}

	public WebElement getOtpTextField() {
		return OtpTextField;
	}

	public WebElement getSingInButton() {
		return SingInButton;
	}

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getSingUpButton() {
		return SingUpButton;
	}
	@FindBy(xpath="//input[@type='number']")
	private WebElement OtpTextField;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement SingInButton;
	
	@FindBy(xpath="//input[@name='userName']")
	private WebElement UserNameTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailTextField;

	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement SingUpButton;

}
