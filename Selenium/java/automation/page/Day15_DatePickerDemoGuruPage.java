package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day15_DatePickerDemoGuruPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@name='bdaytime']")
	WebElement textDateBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnSubmit;
	
	public Day15_DatePickerDemoGuruPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chooseDatePickerPage(String date) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly', 'readonly')", textDateBox);
		textDateBox.clear();
		textDateBox.sendKeys(date);
		btnSubmit.click();
	}
	
	
}
