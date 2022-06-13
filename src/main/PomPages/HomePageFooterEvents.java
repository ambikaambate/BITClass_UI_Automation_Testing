package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFooterEvents {
	public HomePageFooterEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='home_footer_home_clicked']")
	private WebElement homeFooter;
	@FindBy(xpath="//a[@class='home_bottom_bar_about_clicked']")
	private WebElement aboutFooter;
	@FindBy(xpath="//a[@class='home_bottom_bar_contacts_clicked']")
	private WebElement ContactFooter;
	@FindBy(xpath="//a[@class='home_bottom_bar_careers_clicked']")
	private WebElement CareersFooter;
	@FindBy(xpath="//a[@class='teach_on_bitclass_page_clicked']")
	private WebElement TaechOnBitclassFooter;
	@FindBy(xpath="//a[@class='home_bottom_bar_blog_clicked']")
	private WebElement BlogFooter;
	@FindBy(xpath="//span[@class='home_bottom_bar_policy_clicked']")
	private WebElement policyFooter;
	@FindBy(xpath="//span[@class='home_bottom_bar_term_clicked']")
	private WebElement TermsAndConditionFooter;
	@FindBy(xpath="//span[@class='faq_clicked']")
	private WebElement FAQsFooter;
	@FindBy(xpath="//a[text()='Arts']")
	private WebElement ArtsFooter;
	@FindBy(xpath="//a[text()='Music']")
	private WebElement MusicFooter;
	@FindBy(xpath="//a[text()='Dance']")
	private WebElement DanceFooter;
	@FindBy(xpath="//a[text()='Crypto']")
	private WebElement CryptoFooter;
	@FindBy(xpath="//a[text()='Baking']")
	private WebElement BakingFooter;
	@FindBy(xpath="//a[text()='Health']")
	private WebElement HealthFooter;
	public WebElement getHomeFooter() {
		return homeFooter;
	}
	public WebElement getAboutFooter() {
		return aboutFooter;
	}
	public WebElement getContactFooter() {
		return ContactFooter;
	}
	public WebElement getCareersFooter() {
		return CareersFooter;
	}
	public WebElement getTaechOnBitclassFooter() {
		return TaechOnBitclassFooter;
	}
	public WebElement getBlogFooter() {
		return BlogFooter;
	}
	public WebElement getPolicyFooter() {
		return policyFooter;
	}
	public WebElement getTermsAndConditionFooter() {
		return TermsAndConditionFooter;
	}
	public WebElement getFAQsFooter() {
		return FAQsFooter;
	}
	public WebElement getArtsFooter() {
		return ArtsFooter;
	}
	public WebElement getMusicFooter() {
		return MusicFooter;
	}
	public WebElement getDanceFooter() {
		return DanceFooter;
	}
	public WebElement getCryptoFooter() {
		return CryptoFooter;
	}
	public WebElement getBakingFooter() {
		return BakingFooter;
	}
	public WebElement getHealthFooter() {
		return HealthFooter;
	}
	
}
