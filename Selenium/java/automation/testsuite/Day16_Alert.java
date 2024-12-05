package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day16_Alert extends CommonBase{
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.demoAlert);
	}
	
	@Test
	public void ThucHanh() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		driver.switchTo().alert().sendKeys("Our great class");
		driver.switchTo().alert().accept();
		assertTrue(isElementPresent(By.xpath("//p[text()='Hello Our great class How are you today']")));
	}
}
