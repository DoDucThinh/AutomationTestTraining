package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.LoginPage_Day14;
import automation.page.UserManagementPage_Day14;


public class UserManagementTest_Day14 extends CommonBase {
	@BeforeMethod
	public void openfireFox() {
		driver = initFireFox(CT_PageURL.crmstarURL);
		LoginPage_Day14 login = new LoginPage_Day14(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isDisplayed());
	}
	
	@Test(priority = 1)
	public void AddUserFail_WrongFormat() {
		UserManagementPage_Day14 userManagement = new UserManagementPage_Day14(driver);
		userManagement.addUser("DoDucThinh", "thinhthinh1703@gmail.com", "0961098469", "3", "1", "2", "AutoTest1");
		assertTrue(driver.findElement(By.xpath("//div[text()='Dữ liệu nhập vào sai định dạng']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void AddUserSuccessfully() {
		UserManagementPage_Day14 userManagement = new UserManagementPage_Day14(driver);
		userManagement.addUser("DoDucThinh", "thinhđuco1703@gmail.com", "961098469", "3", "1", "2", "1708");
		assertTrue(driver.findElement(By.xpath("//button[text()='Tìm kiếm']")).isDisplayed());
	}
	
}
