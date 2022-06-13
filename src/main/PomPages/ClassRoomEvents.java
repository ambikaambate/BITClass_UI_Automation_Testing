package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassRoomEvents {
	public ClassRoomEvents(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='X Close']")
	private WebElement ClassroomCloseButton;
	public WebElement getClassroomCloseButton() {
		return ClassroomCloseButton;
	}

}
