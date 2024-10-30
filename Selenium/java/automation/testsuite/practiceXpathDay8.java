package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class practiceXpathDay8 extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void getLocatorAutomationfc() {
		WebElement name = driver.findElement(By.id("name"));
		System.out.println("name is: " + name);
		
		WebElement address = driver.findElement(By.name("address"));
		System.out.println("address is: " + address);
		
		WebElement email = driver.findElement(By.name("email"));
		System.out.println("email is: " + email);
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("password is: " + password);
	}
}
