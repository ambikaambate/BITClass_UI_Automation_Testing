package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithGmail {
	public LoginWithGmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//button[text() = 'Sign in with google']")
	private WebElement googleButton;
   
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement EmailTextFiled;

	@FindBy(xpath="//input[@name='password']")
	private WebElement pwdTextFiled;

	public WebElement getGoogleButton() {
		return googleButton;
	}

	public WebElement getEmailTextFiled() {
		return EmailTextFiled;
	}

	public WebElement getPwdTextFiled() {
		return pwdTextFiled;
	}
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}
}
