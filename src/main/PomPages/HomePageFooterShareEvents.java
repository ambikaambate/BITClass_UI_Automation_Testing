package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFooterShareEvents {
	public HomePageFooterShareEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='home_bottom_bar_linkedin_clicked']")
	private WebElement LinkedInIcon;
	@FindBy(xpath="//a[@class='home_bottom_bar_fb_clicked']")
	private WebElement FacebookIcon;
	@FindBy(xpath="//a[@class='home_bottom_bar_instagram_clicked']")
	private WebElement InstagramIcon;
	@FindBy(xpath="//a[@class='home_bottom_bar_twitter_clicked']")
	private WebElement Twottericon;
	public WebElement getLinkedInIcon() {
		return LinkedInIcon;
	}
	public WebElement getFacebookIcon() {
		return FacebookIcon;
	}
	public WebElement getInstagramIcon() {
		return InstagramIcon;
	}
	public WebElement getTwottericon() {
		return Twottericon;
	}
	
}
