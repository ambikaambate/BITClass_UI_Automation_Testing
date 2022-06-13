package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferalEvents {
	public ReferalEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='View Your Transactions']")
	private WebElement Transactionslink;
	@FindBy(xpath="//button[text()='refer.bitclass.live']")
	private WebElement referLink;
	@FindBy(xpath="//button [text()='Click To Copy']")
	private WebElement ClickToCopyButton;
	public WebElement getTransactionslink() {
		return Transactionslink;
	}
	public WebElement getReferLink() {
		return referLink;
	}
	public WebElement getClickToCopyButton() {
		return ClickToCopyButton;
	}
}
