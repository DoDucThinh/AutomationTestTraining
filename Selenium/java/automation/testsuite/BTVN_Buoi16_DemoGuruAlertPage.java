package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_Buoi16_DemoGuruAlertPage extends CommonBase{
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.demoGuruAlert);
	}
	
	@Test
	public void AlertPractise() {
		type(By.name("cusid"), "123");
		click(By.name("submit"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
	    Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		alert1.accept();
		
		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = alert2.getText();
		String expectedMessage = "Customer Successfully Delete!";
		assertEquals(actualMessage , expectedMessage, "Alert không đúng");
		
		alert2.accept();
		String curruntURL = driver.getCurrentUrl();
		assertEquals(curruntURL, CT_PageURL.demoGuruAlert, "Url không đúng sau khi xử lý Alert.");
	}
}
