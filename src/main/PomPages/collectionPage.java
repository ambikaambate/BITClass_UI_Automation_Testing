 package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class collectionPage {
public collectionPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='login']")
private WebElement CDPLoginButton;
@FindBy(xpath="//input[@name='phoneNumber']")
private WebElement CDPMobileNoTextField;
@FindBy(xpath="//input[@type='number']")
private WebElement CDPOtpTextField;
@FindBy(xpath="//input[@name='userName']")
private WebElement CDPUserNameTextField;
@FindBy(xpath="(//div[@class='styles_overlay__cy2xH'])[1]")
private WebElement CollectionCourseCard;
@FindBy(xpath="//span[@class='styles_schedule__vLxxk'])[1]")
private WebElement CollectionScheduleTab;
@FindBy(xpath="//button[text()='Choose & Continue']")
private WebElement CollectionChooseAndContinueButton;
@FindBy(xpath="//button[text()='Click to Book']")
private WebElement collectionClickTOBookButton;
@FindBy(xpath="//button[text()='Explore More']")
private WebElement ExplreMoreButton;
public WebElement getCDPLoginButton() {
	return CDPLoginButton;
}
public WebElement getCDPMobileNoTextField() {
	return CDPMobileNoTextField;
}
public WebElement getCDPOtpTextField() {
	return CDPOtpTextField;
}
public WebElement getCDPUserNameTextField() {
	return CDPUserNameTextField;
}
public WebElement getCollectionCourseCard() {
	return CollectionCourseCard;
}
public WebElement getCollectionScheduleTab() {
	return CollectionScheduleTab;
}
public WebElement getCollectionChooseAndContinueButton() {
	return CollectionChooseAndContinueButton;
}
public WebElement getCollectionClickTOBookButton() {
	return collectionClickTOBookButton;
}
public WebElement getExplreMoreButton() {
	return ExplreMoreButton;
}
}
