package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="(//div[@class='styles_courseCardContainer__t9LCW'])[1]")
	private WebElement CourseCard;
	public WebElement getCourseCard() {
		return CourseCard;
	}
	@FindBy(xpath="//div[@class='styles_profilePic__HS0FN']")
	private WebElement loginDropDown;
	public WebElement getLoginDropDown() {
		return loginDropDown;
	}
	@FindBy(xpath="//p[text()='My Classes']")
	private WebElement MyClassSection;
	public WebElement getMyClassSection() {
		return MyClassSection;
	
	}
	@FindBy(xpath="//input[@placeholder='Search LIVE Classes']")
	private WebElement SearchBar;
	public WebElement getSearchBar() {
		return SearchBar;
	}
	@FindBy(xpath="(//div[@class='individualCard___Q_6gZ'])[1]")
	private WebElement coursecardfromsearchpage;
	public WebElement getCoursecardfromsearchpage() {
		return coursecardfromsearchpage;
	}
	@FindBy(xpath="//div[text()='Free Classes']")
	private WebElement FreeCourseTab;
	@FindBy(xpath="//div[text()='Courses']")
	private WebElement courseTab;
	public WebElement getFreeCourseTab() {
		return FreeCourseTab;
	}
	public WebElement getCourseTab() {
		return courseTab;
	}
	@FindBy(xpath="(//h5[text()='TMRPPPPPPP'])[4]")
	private WebElement TMPRcourseCard;
	public WebElement getTMPRcourseCard() {
		return TMPRcourseCard;
	}
	@FindBy(xpath="//button[text()='Join for ₹1000']")
	private WebElement FullCOurseCard;
	public WebElement getFullCOurseCard() {
		return FullCOurseCard;
	}
	@FindBy(xpath="//span[text()='Sketching & Painting']")
	private WebElement CategoryTab;
	public WebElement getCategoryTab() {
		return CategoryTab;
	}
	@FindBy(xpath="(//button[text()='Attend NOW'])[1]")
	private WebElement AttendNowButton;
	public WebElement getAttendNowButton() {
		return AttendNowButton;
	}
	@FindBy(id="close-icon")
	private WebElement closeIcon;
	public WebElement getCloseIcon() {
		return closeIcon;
	}
	@FindBy(xpath="(//div[@class='styles_teacherCard__UlDft'])[1]")
	private WebElement StarTeacherProfile;
	public WebElement getStarTeacherProfile() {
		return StarTeacherProfile;
	}
	@FindBy(xpath="//div[text()='Workshops']")
	private WebElement WorkshopFilterTab;
	public WebElement getWorkshopFilterTab() {
		return WorkshopFilterTab;
	}
	@FindBy(xpath="(//button[text()='Register for FREE'])[1]")
	private WebElement registerForFreeButton;
	public WebElement getRegisterForFreeButton() {
		return registerForFreeButton;
	}
	@FindBy(xpath="(//button[text()='Join for ₹1499'])[1]")
	private WebElement JoinForButton;
	public WebElement getJoinForButton() {
		return JoinForButton;
	}
	@FindBy(xpath="(//div[@class='styles_imageBannerContainer__SmLtT'])[2]")
	private WebElement HomePageBanner;
	public WebElement getHomePageBanner() {
		return HomePageBanner;
	}
	@FindBy(xpath="//button[text()='login']")
	private WebElement LoginButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
}
