package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AladaSignUp extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
	}
	
	@Test
	public void getAlada() {
		WebElement textHoVaTen = driver.findElement(By.xpath("//input[@name='txtFirstname']"));
		System.out.println("This is Ho va Ten text: " + textHoVaTen);
		
		WebElement textEmail = driver.findElement(By.xpath("//input[@name='txtEmail']"));
		System.out.println("This is Email text: " + textEmail);
		
		WebElement textNhapLaiEmail = driver.findElement(By.xpath("//input[@name='txtCEmail']"));
		System.out.println("This is Nhap Lai Email Text: " + textNhapLaiEmail);
		
		WebElement textPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		System.out.println("This is Password text: " + textPassword);
		
		WebElement textNhapLaiPassword = driver.findElement(By.xpath("//input[@name='txtCPassword']"));
		System.out.println("This is Nhap Lai Password text: " + textNhapLaiPassword);
		
		WebElement textDienThoai = driver.findElement(By.xpath("//input[@name='txtPhone']"));
		System.out.println("This is Dien Thoai text: " + textDienThoai);
		
		WebElement checkboxAgree = driver.findElement(By.xpath("//input[contains(@type,'checkbox') and @class='marleft0']"));
		System.out.println("This is checkbox: I agree to Alada.vn's policies and terms of use" + checkboxAgree);
		
		WebElement chinhSach = driver.findElement(By.xpath("//a[contains(text(),'chính sách')]"));
		System.out.println("This is Chinh Sach link: " + chinhSach);
		
		WebElement thoaThuanSuDung = driver.findElement(By.xpath("//a[contains(text(),'thỏa thuận')]"));
		System.out.println("This is Thoa Thuan Su Dung link: " + thoaThuanSuDung);
		
		WebElement buttonDangKy = driver.findElement(By.xpath("//button[contains(text(),'ĐĂNG KÝ') and @type='submit']"));
		System.out.println("This is Dang Ky button: " + buttonDangKy);
	}
}
