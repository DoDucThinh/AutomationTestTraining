package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Google extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://www.google.co.id/?hl=en");
	}
	
	@Test
	public void getGoogle() {
		WebElement googleSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		System.out.println("This is Google search" + googleSearch);
		
		WebElement imFeelingLucky = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
		System.out.println("This is I'm Feeling Lucky" + imFeelingLucky);
				
		WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println("Logo google is: " + logo);
	}
}
