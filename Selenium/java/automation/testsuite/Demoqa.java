package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Demoqa extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://demoqa.com/login");
	}
	
	@Test
	public void getDemopa() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
		System.out.println("User name is: " + userName);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		System.out.println("Password is: " + password);
		
		WebElement buttonLogin = driver.findElement(By.xpath("//button[@id='login']"));
		System.out.println("Login button is: " + buttonLogin);
		
		WebElement buttonNewUser = driver.findElement(By.xpath("//button[@id='newUser']"));
		System.out.println("New User button is: " + buttonNewUser);
	}
}
