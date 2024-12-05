package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_Buoi16_SeleniumPractise_AlertTest extends CommonBase{
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.seleniumPratise);
	}
	
	@Test
	public void AlertPractise() {
		click(By.xpath("//button[text()='Try it']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		String expectedMessage = "Welcome to Selenium WebDriver Tutorials";
		assertEquals(actualMessage , expectedMessage, "Alert không đúng");
		
		alert.accept();
	}
}
