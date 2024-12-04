package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tedu_CapNhapMatKhauPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Đăng nhập']")
	WebElement btnDangNhap;
	@FindBy(id = "UserName")
	WebElement textUserName;
	@FindBy(id = "Password")
	WebElement textPassword;
	@FindBy(xpath = "//button[text()='Đăng nhập']")
	WebElement btnDangNhapLogin;
	@FindBy(id = "onesignal-slidedown-cancel-button")
	WebElement btnLater;
	@FindBy(xpath = "//a[@title='Tài khoản' and @data-toggle='dropdown']")
	WebElement btnAvatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']")
	WebElement btnDoiMatKhau;
	@FindBy(id = "OldPassword")
	WebElement textMatKhauCu;
	@FindBy(id = "NewPassword")
	WebElement textMatKhauMoi;
	@FindBy(id = "ConfirmNewPassword")
	WebElement textNhapLaiMatKhau;
	@FindBy(xpath = "//input[@value='Cập nhật']")
	WebElement btnCapNhap;
	//search
	@FindBy(xpath = "//input[@class='autosearch-input form-control']")
	WebElement textSearch;
	@FindBy(xpath = "//button[@class='button-search btn btn-primary']")
	WebElement btnSearch;
	
	public Tedu_CapNhapMatKhauPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPage(String userName, String password) {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", btnDangNhap);
		btnDangNhap.click();
		textUserName.sendKeys(userName);
		textPassword.sendKeys(password);
		btnDangNhapLogin.click();
	}
	
	public void CloseNotification() {
		btnLater.click();
	}
	
	public void CapNhapMatKhau(String oldPassword, String newPassword) {
		btnAvatar.click();
		btnDoiMatKhau.click();
		textMatKhauCu.sendKeys(oldPassword);
		textMatKhauMoi.sendKeys(newPassword);
		textNhapLaiMatKhau.sendKeys(newPassword);
		btnCapNhap.click();
	}
	
	public void search(String valueSearch) {
		textSearch.clear();
		textSearch.sendKeys(valueSearch);
		btnSearch.click();
	}
	
	
}
