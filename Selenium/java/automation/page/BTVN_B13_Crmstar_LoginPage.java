package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.CT_Crmstar_Login;

public class BTVN_B13_Crmstar_LoginPage {
	private WebDriver driver;

	public BTVN_B13_Crmstar_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void LoginFunction(String email, String pass) {
		WebElement textEmail = driver.findElement(CT_Crmstar_Login.TextEmail);
		if(textEmail.isDisplayed()) {
			textEmail.clear();
			textEmail.sendKeys(email);
		}
		
		WebElement textPassword = driver.findElement(CT_Crmstar_Login.TextMatKhau);
		if(textPassword.isDisplayed()) {
			textPassword.clear();
			textPassword.sendKeys(pass);
		}
		
		WebElement buttonLogin = driver.findElement(CT_Crmstar_Login.ButtonDangNhap);
		if(buttonLogin.isDisplayed()) {
			buttonLogin.click();
		}
	}
}
