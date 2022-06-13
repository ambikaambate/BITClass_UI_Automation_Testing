package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPageevents {
	public CategoryPageevents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='ref experiments']")
	private WebElement FeaturedCourseCard;
	@FindBy(xpath="//button[text()='Click to Book']")
	private WebElement ClickToBookButton; 
	@FindBy(xpath="//button[text()='Explore More']")
	private WebElement ExploreButton;
	@FindBy(xpath="(//div[@class='styles_thumbnailImg__jc1er'])[1]")
	private WebElement coursecard;
	public WebElement getCoursecard() {
		return coursecard;
	}
	public WebElement getFeaturedCourseCard() {
		return FeaturedCourseCard;
	}
	public WebElement getClickToBookButton() {
		return ClickToBookButton;
	}
	public WebElement getExploreButton() {
		return ExploreButton;
	}
	
}

