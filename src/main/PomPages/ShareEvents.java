package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareEvents {
	public ShareEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Invite']")
    private WebElement inviteButton;
	@FindBy(xpath="//button[@aria-label='whatsapp']")
    private WebElement whatsupIcon;
	@FindBy(xpath="//button[@aria-label='facebook']")
    private WebElement facebookIcon;
	@FindBy(xpath="//button[@aria-label='twitter']")
    private WebElement twitterIcon;
	@FindBy(xpath="//button[@aria-label='telegram']")
    private WebElement telegramicon;
	@FindBy(xpath="//div[@title='Copy Link']")
    private WebElement shareLink;
	public WebElement getInviteButton() {
		return inviteButton;
	}
	public WebElement getWhatsupIcon() {
		return whatsupIcon;
	}
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public WebElement getTwitterIcon() {
		return twitterIcon;
	}
	public WebElement getTelegramicon() {
		return telegramicon;
	}
	public WebElement getShareLink() {
		return shareLink;
	}
}