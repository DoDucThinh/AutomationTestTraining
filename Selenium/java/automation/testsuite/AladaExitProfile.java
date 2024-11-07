package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AladaExitProfile extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
		loginAlada();
	}
	
	private void loginAlada() {
		WebElement textEmail = driver.findElement(By.xpath("//input[@id='txtLoginUsername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='txtLoginPassword']"));
        
        textEmail.sendKeys("thinhthinh1703@gmail.com");
        password.sendKeys("123456");
        
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'ĐĂNG NHẬP') and @type='submit']"));
        loginButton.click();
		
        driver.get("https://alada.vn/thong-tin-ca-nhan");
	}

	@Test
	public void getAlada() {
		WebElement textHo = driver.findElement(By.xpath("//input[@id='member_lastname']"));
		System.out.println("This is Ho text: " + textHo);
		
		WebElement textTen = driver.findElement(By.xpath("//input[@id='member_firstname']"));
		System.out.println("This is Ten text: " + textTen);
		
		WebElement checkGioiTinhNam = driver.findElement(By.xpath("//input[@type='radio' and @value=1]"));
		System.out.println("This is Gioi Tinh Nam: " + checkGioiTinhNam);
		
		WebElement checkGioiTinhNu = driver.findElement(By.xpath("//input[@type='radio' and @value=0]"));
		System.out.println("This is Gioi Tinh Nu: " + checkGioiTinhNu);
		
		WebElement dropdownTinhTP = driver.findElement(By.xpath("//select[@id='txtCity']"));
		System.out.println("This is Tinh Thanh Pho dropdown: " + dropdownTinhTP);
		
		WebElement textNgaySinh = driver.findElement(By.xpath("//input[@id='member_birthday']"));
		System.out.println("This is Ngay Sinh text: " + textNgaySinh);
		
		WebElement textDienThoai = driver.findElement(By.xpath("//input[@id='member_tel']"));
		System.out.println("This is Dien Thoai text: " + textDienThoai);
		
		WebElement textDiaChi = driver.findElement(By.xpath("//input[@id='member_address']"));
		System.out.println("This is Dia Chi text: " + textDiaChi);
		
		WebElement textCongTy = driver.findElement(By.xpath("//input[@id='member_company']"));
		System.out.println("This is Cong Ty text: " + textCongTy);
		
		WebElement buttonLuuThongTin = driver.findElement(By.xpath("//button[contains(text(),'Lưu thông tin')]"));
		System.out.println("This is Luu Thong Tin button: " + buttonLuuThongTin);
	}
}
