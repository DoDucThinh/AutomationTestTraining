package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.Tedu_CapNhapMatKhauPage;

public class Tedu_CapNhapMatKhauTest extends CommonBase{
	public Tedu_CapNhapMatKhauPage teduPage;
	String currentPassword = "1234564126311431";
	@BeforeMethod
	public void openFireFox() {
		driver = initChromeDriver(CT_PageURL.tedu);
		teduPage = new Tedu_CapNhapMatKhauPage(driver);
	}
	
	@Test(priority = 1)
	public void UpdatePasswordSuccessfully() throws InterruptedException {
		Random rand = new Random();
		int value = rand.nextInt(50);
		String newPassword = currentPassword + value;
		System.out.println(newPassword);
		
		LoginSuccessfully();		
		teduPage.CapNhapMatKhau(currentPassword, newPassword);
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
		currentPassword = newPassword;
		System.out.println(currentPassword);
	}
	
	@Test(priority = 2)
	public void LoginSuccessfully() throws InterruptedException {
		Thread.sleep(3000);
		teduPage.CloseNotification();
		Thread.sleep(3000);
		System.out.println(currentPassword);
		teduPage.LoginPage("thinhthinh1703@gmail.com", currentPassword);
		assertTrue(driver.findElement(By.xpath("//a[@title='Tài khoản' and @data-toggle='dropdown']")).isDisplayed());		
	}
	
	@Test(priority = 3)
	public void SearchSuccessfully_validValue() throws InterruptedException {
		LoginSuccessfully();
		teduPage.search("ASP Net");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
	}
	
	@Test(priority = 4)
	public void SearchSuccessfully_keywordNoResults() throws InterruptedException {
		LoginSuccessfully();
		teduPage.search("akm");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//p[text()='Dữ liệu đang cập nhật...']")).isDisplayed());
	}
	
	@Test(priority = 5)
	public void SearchSuccessfully_emptyValue() throws InterruptedException {
		LoginSuccessfully();
		teduPage.search("");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//label[text()='Khoá học']")).isDisplayed());
	}
	
	@Test(priority = 6)
	public void SearchSuccessfully_specialCharacters() throws InterruptedException {
		LoginSuccessfully();
		teduPage.search("$%^#^");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//p[text()='Dữ liệu đang cập nhật...']")).isDisplayed());
	}
}
