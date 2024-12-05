package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class Day16_CodeStar_QLKLVPage extends CommonBase{
	private WebDriver driver;
	
	public Day16_CodeStar_QLKLVPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void ThemKLVFunctionSuccessfully(String maKLV, String tenKLV) {
		click(By.xpath("//a[normalize-space()='Quản lý khu làm việc' and @class='nav-link link-dark']"));
		click(By.xpath("//button[text()='Thêm mới']"));
		type(By.name("work_areas_code"), maKLV);
		type(By.name("name"), tenKLV);
		click(By.xpath("//button[text()='Lưu']"));
		click(By.xpath("//button[text()='Thêm']"));
	}
	
	public void ThemKLVFunctionFail(String maKLV, String tenKLV) {
		click(By.xpath("//a[normalize-space()='Quản lý khu làm việc' and @class='nav-link link-dark']"));
		click(By.xpath("//button[text()='Thêm mới']"));
		type(By.name("work_areas_code"), maKLV);
		type(By.name("name"), tenKLV);
		click(By.xpath("//button[text()='Lưu']"));
	}
	
	public void TimKLVFunction(String valueKLV) {
		click(By.xpath("//a[normalize-space()='Quản lý khu làm việc' and @class='nav-link link-dark']"));
		type(By.xpath("//input[@placeholder='Nhập từ khóa cần tìm kiếm']"), valueKLV);;
		click(By.xpath("//button[text()='Tìm kiếm']"));
	}
	
	public void XoaKLVFunction() {
		click(By.xpath("//a[normalize-space()='Xóa']"));
		driver.switchTo().alert().accept();
	}
}
