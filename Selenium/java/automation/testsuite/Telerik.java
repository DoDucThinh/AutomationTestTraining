package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Telerik extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://www.telerik.com/design-system/docs/components/checkbox/");
	}
	
	@Test
	public void getTelerik() {
		WebElement checkboxInvalid = driver.findElement(By.xpath("//input[@id='invalid']"));
		System.out.println("This is Invalid Checkbox: " + checkboxInvalid);
		
		WebElement checkboxDisabled = driver.findElement(By.xpath("//input[@id='disabled']"));
		System.out.println("This is Invalid Checkbox: " + checkboxDisabled);
		
		WebElement checkboxIndeterminate = driver.findElement(By.xpath("//input[@id='indeterminate']"));
		System.out.println("This is Invalid Checkbox: " + checkboxIndeterminate);
	}
}
