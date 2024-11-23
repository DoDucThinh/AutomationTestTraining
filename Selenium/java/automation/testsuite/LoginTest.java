package automation.testsuite;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.LoginPage;

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openBrowse() {
		driver = initEdge(CT_PageURL.aladaURL);
	}
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("thinhthinh1703@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void loginFail_IncorrectEmail() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("thinhthinh1704@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
	}
	
	@Test(priority = 3)
	public void loginFail_IncorrectPass() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("thinhthinh1703@gmail.com", "12345");
		assertTrue(driver.findElement(By.xpath("//p[text()='Mật khẩu sai.']")).isDisplayed());
	}
}
