package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Techydevs extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
	}
	
	@Test
	public void getTechydevs() {
		WebElement slideTravels = driver.findElement(By.xpath("//h2[contains(text(),'What are you interested in')]/descendant::b[text()='Travels']"));
		System.out.println("This is slide Travels" + slideTravels);
		
		WebElement selectACountry = driver.findElement(By.xpath("//span[text()='Select a Country']"));
		System.out.println("This is drop list down Select a Country" + selectACountry);
		
		WebElement selectACategory = driver.findElement(By.xpath("//span[text()='Select a Category']/ancestor::a"));
		System.out.println("This is deop list down Select a Category" + selectACategory);
	}
}
