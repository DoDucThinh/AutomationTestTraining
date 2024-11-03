package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Selectorshub extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void getSelectorhub() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println("User name is: " + userName);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
		System.out.println("Password is: " + password);
		
		WebElement company = driver.findElement(By.xpath("(//input[@placeholder='Enter your company'])[position()=1]"));
		System.out.println("Company is: " + company);
		
		WebElement mobileNumber = driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[position()=1]"));
		System.out.println("Mobile number is: " + mobileNumber);
		
		WebElement submit = driver.findElement(By.xpath("//button[@value='Submit']"));
		System.out.println("Submit is: " + submit);
		
		WebElement johnSmith = driver.findElement(By.xpath("(//tr[@class='usr_acn'])[3]"));
		System.out.println("John.Smith's information: " + johnSmith);
		
		WebElement jordanMathews = driver.findElement(By.xpath("(//tr[@class='plan rit'])[2]"));
		System.out.println("Jordan.Mathews's information: " + jordanMathews);
		
		WebElement kevinMathews = driver.findElement(By.xpath("(//tr[@class='plan rit'])[3]"));
		System.out.println("Kevin.Mathews's information: " + kevinMathews);
	}
}
