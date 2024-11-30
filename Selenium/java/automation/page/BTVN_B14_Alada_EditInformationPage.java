package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTVN_B14_Alada_EditInformationPage {
	private WebDriver driver;
	@FindBy(xpath = "//div[@class='avatar2']")
	WebElement dropdownInformation;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']")
	WebElement btnChinhSuaThongTin;
	@FindBy(id = "txtpassword")
	WebElement textPassword;
	@FindBy(id = "txtnewpass")
	WebElement textNewPassword;
	@FindBy(id = "txtrenewpass")
	WebElement textCNewPassword;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
	WebElement btnLuuMatKhauMoi;
	public BTVN_B14_Alada_EditInformationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void editPassword(String password, String newPassword, String cNewPassword) {
		dropdownInformation.click();
		btnChinhSuaThongTin.click();
		textPassword.sendKeys(password);
		textNewPassword.sendKeys(newPassword);
		textCNewPassword.sendKeys(cNewPassword);
		btnLuuMatKhauMoi.click();
	}
	
}
