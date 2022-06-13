package main.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentIdCard {
	public StudentIdCard(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Edit ID Card']")
	private WebElement editCardButton;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement nameTextFiled;

	@FindBy(xpath="//span[text()='Female']")
	private WebElement GenderOption;

	@FindBy(xpath="//input[@id='city_search']")
	private WebElement searchCity;

	@FindBy(xpath="//input[@name='profession']")
	private WebElement workProfession;
	
	@FindBy(xpath="//button[text()='Save and Submit']")
	private WebElement saveAndSubmitButton;
	
	@FindBy(xpath="//input[@name='age']")
	private WebElement AgeDropDown;
	
	@FindBy(xpath="(//button[@type='button'])[12]")
	public WebElement CloseButton;

	public WebElement getEditCardButton() {
		return editCardButton;
	}

	public WebElement getNameTextFiled() {
		return nameTextFiled;
	}

	public WebElement getGenderOption() {
		return GenderOption;
	}

	public WebElement getSearchCity() {
		return searchCity;
	}

	public WebElement getWorkProfession() {
		return workProfession;
	}

	public WebElement getSaveAndSubmitButton() {
		return saveAndSubmitButton;
	}

	public WebElement getAgeDropDown() {
		return AgeDropDown;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	@FindBy(xpath="(//img[@decoding='async'])[2]")
	private WebElement bitclassButton;

	public WebElement getBitclassButton() {
		return bitclassButton;
	}
}