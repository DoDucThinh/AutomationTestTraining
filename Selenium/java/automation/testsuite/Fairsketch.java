package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Fairsketch extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://rise.fairsketch.com/events");	
	}

	@Test
	public void getFairsketch() {
		WebElement testEvent = driver.findElement(By.xpath("//td[@data-date='2024-11-12']//span[text()=' Industry Panel Discussion']"));
		System.out.println("This is event: " + testEvent);
	}
	
}
