package automation.testsuite;

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
import automation.page.BTVN_B14_Alada_EditInformationPage;
import automation.page.BTVN_B14_Alada_LoginPage;

public class BTVN_B14_Alada_EditInformationTest extends CommonBase {
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.aladaBTVNB14);
		BTVN_B14_Alada_LoginPage login = new BTVN_B14_Alada_LoginPage(driver);
		login.Login("thinhthinh1708@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']"))
				.isDisplayed());
	}

	@Test(priority = 1)
	public void EditPasswordSuccessfully() throws InterruptedException {
		BTVN_B14_Alada_EditInformationPage edit = new BTVN_B14_Alada_EditInformationPage(driver);
		edit.editPassword("123456", "123455", "123455");
		// Chờ alert thông báo hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK"
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(1000);

		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']"))
				.isDisplayed());				
	}
	
	
}
