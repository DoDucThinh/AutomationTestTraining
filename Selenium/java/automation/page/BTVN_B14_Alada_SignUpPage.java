package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTVN_B14_Alada_SignUpPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Đăng Ký')]")
	WebElement btnDangKy;
	@FindBy(id = "txtFirstname")
	WebElement textHoVaTen;
	@FindBy(id = "txtEmail")
	WebElement textEmail;
	@FindBy(id = "txtCEmail")
	WebElement textCEmail;
	@FindBy(id = "txtPassword")
	WebElement textPassword;
	@FindBy(id = "txtCPassword")
	WebElement textCPassword;
	@FindBy(id = "txtPhone")
	WebElement textPhone;
	@FindBy(xpath = "//button[contains(text(),'ĐĂNG KÝ') and @type='submit']")
	WebElement btnSDangKy;
		
	public BTVN_B14_Alada_SignUpPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SignUp(String hoVaTen, String email, String cEmail, String password, String cPassword, String phoneNumber) {
		btnDangKy.click();
		textHoVaTen.sendKeys(hoVaTen);
		textEmail.sendKeys(email);
		textCEmail.sendKeys(cEmail);
		textPassword.sendKeys(password);
		textCPassword.sendKeys(cPassword);
		textPhone.sendKeys(phoneNumber);
		btnSDangKy.click();
	}
}
