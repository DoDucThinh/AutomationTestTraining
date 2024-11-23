package automation.testsuite;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.BTVN_B13_Crmstar_LoginPage;

public class BTVN_B13_Crmstar_LoginTest extends CommonBase {
	@BeforeMethod
	public void openBrower() {
		driver = initFireFox(CT_PageURL.crmstarURL);
	}

	@Test(priority = 1)
	public void loginSuccessfully() throws InterruptedException {
		BTVN_B13_Crmstar_LoginPage login = new BTVN_B13_Crmstar_LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "12345678");

		// Chờ alert hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK" (hoặc "Continue")
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(1000);

		assertTrue(driver.findElement(By.xpath("//p[@class='text']")).isDisplayed());
	}

	@Test(priority = 2)
	public void loginFail_IncorrectEmail() {
		BTVN_B13_Crmstar_LoginPage login = new BTVN_B13_Crmstar_LoginPage(driver);
		login.LoginFunction("admin88@gmail.com", "12345678");

		// Chờ alert hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK" (hoặc "Continue")
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Lấy URL hiện tại sau khi đăng nhập
		String currentUrl = driver.getCurrentUrl();

		// Kiểm tra rằng URL vẫn là trang đăng nhập (hoặc URL mà bạn mong đợi)
		assertEquals(currentUrl, CT_PageURL.crmstarURL,
				"Testcase sai. Trang bị chuyển hướng sang trang khác khi email sai.");
	}

	@Test(priority = 3)
	public void loginFail_IncorrectPassword() {
		BTVN_B13_Crmstar_LoginPage login = new BTVN_B13_Crmstar_LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "12345688");

		// Chờ alert hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK" (hoặc "Continue")
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Lấy URL hiện tại sau khi đăng nhập
		String currentUrl = driver.getCurrentUrl();

		// Kiểm tra rằng URL vẫn là trang đăng nhập (hoặc URL mà bạn mong đợi)
		assertEquals(currentUrl, CT_PageURL.crmstarURL,
				"Testcase sai. Trang bị chuyển hướng sang trang khác khi password sai.");
	}

	@Test(priority = 4)
	public void loginFail_IncorrectEmailAndPassword() {
		BTVN_B13_Crmstar_LoginPage login = new BTVN_B13_Crmstar_LoginPage(driver);
		login.LoginFunction("admin88@gmail.com", "12345688");

		// Chờ alert hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK" (hoặc "Continue")
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Lấy URL hiện tại sau khi đăng nhập
		String currentUrl = driver.getCurrentUrl();

		// Kiểm tra rằng URL vẫn là trang đăng nhập (hoặc URL mà bạn mong đợi)
		assertEquals(currentUrl, CT_PageURL.crmstarURL,
				"Testcase sai. Trang bị chuyển hướng sang trang khác khi email và password sai.");
	}

	@Test(priority = 5)
	public void logout() throws InterruptedException {
		BTVN_B13_Crmstar_LoginPage login = new BTVN_B13_Crmstar_LoginPage(driver);
		login.LoginFunction("admin@gmail.com", "12345678");

		// Chờ alert hiển thị
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Chuyển sang alert và nhấn "OK" (hoặc "Continue")
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(10000);

	    WebElement dropdownMenu = driver.findElement(By.xpath("//a[contains(text(),'Admin')]"));
	    dropdownMenu.click();

	    WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Đăng xuất' and @class='dropdown-item']"));
	    logoutButton.click();
	    
	    driver.findElement(By.xpath("//button[text()='Đăng xuất' and @type='submit']")).click();
	    
	    assertTrue(driver.findElement(By.xpath("//button[text()='Đăng nhập']")).isDisplayed());
		
		
	}

}
