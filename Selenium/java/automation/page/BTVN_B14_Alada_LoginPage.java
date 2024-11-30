package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTVN_B14_Alada_LoginPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Đăng Nhập')]")
	WebElement btnDangNhap;
	@FindBy(id = "txtLoginUsername")
	WebElement textEmail;
	@FindBy(id = "txtLoginPassword")
	WebElement textPassord;
	@FindBy(xpath = "//button[contains(text(),'ĐĂNG NHẬP') and @type='submit']")
	WebElement btnSDangNhap;
	public BTVN_B14_Alada_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Login(String email, String password) {
		btnDangNhap.click();
		textEmail.sendKeys(email);
		textPassord.sendKeys(password);
		btnSDangNhap.click();
	}
	
}
