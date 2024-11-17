package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class DemopaForm extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demoqa.com/automation-practice-form");
		
	}
	
	@Test
	public void getDemopaForm() {
		WebElement checkboxSports = driver.findElement(By.xpath("//label[contains(text(),'Sports')]/preceding-sibling::input"));
		System.out.println("This is checkbox Sport" + checkboxSports);
		
		WebElement checkboxReading = driver.findElement(By.xpath("//label[contains(text(),'Reading')]/preceding-sibling::input"));
		System.out.println("This is checkbox Reading" + checkboxReading);
		
		WebElement checkboxMusic = driver.findElement(By.xpath("//label[contains(text(),'Music')]/preceding-sibling::input"));
		System.out.println("This is checkbox Music" + checkboxMusic);
		
		//Bai2 BtvnB11
		WebElement selectState = driver.findElement(By.xpath("//div[text()='Select State']"));
		System.out.println("This is Select State drop down" + selectState);
	}
}
