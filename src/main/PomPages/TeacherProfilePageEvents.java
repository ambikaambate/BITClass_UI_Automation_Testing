package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherProfilePageEvents {
	public TeacherProfilePageEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@aria-label='whatsapp']")
	private WebElement whatsAppIcon;
	@FindBy(xpath="//button[@aria-label='facebook']")
	private WebElement FaceBookIcon;
	@FindBy(xpath="//button[@aria-label='twitter']")
	private WebElement TwitterIcon;
	@FindBy(xpath="//button[@aria-label='telegram']")
	private WebElement TelegramIcon;
	@FindBy(xpath="//div[@title='Copy Link']")
	private WebElement sharelink;
	@FindBy(xpath="//div[@class='seeMoreElement___27K2M']")
	private WebElement seeMoreTab;
	@FindBy(xpath="//div[@class='seeMoreElement___27K2M']")
	private WebElement seeLessTab;
	@FindBy(xpath="//img[@alt='share']")
	private WebElement shareButton;
	
	public WebElement getShareButton() {
		return shareButton;
	}
	public WebElement getWhatsAppIcon() {
		return whatsAppIcon;
	}
	public WebElement getFaceBookIcon() {
		return FaceBookIcon;
	}
	public WebElement getTwitterIcon() {
		return TwitterIcon;
	}
	public WebElement getTelegramIcon() {
		return TelegramIcon;
	}
	public WebElement getSharelink() {
		return sharelink;
	}
	public WebElement getSeeMoreTab() {
		return seeMoreTab;
	}
	public WebElement getSeeLessTab() {
		return seeLessTab;
	}
}
