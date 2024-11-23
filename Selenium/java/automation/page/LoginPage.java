package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import automation.constant.CT_Account;

public class LoginPage {
	
	private WebDriver driver;
	
	
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void LoginFunction(String email, String pass) {
		WebElement textLogin = driver.findElement(CT_Account.TEXT_EMAIL);
		if(textLogin.isDisplayed()) {
			textLogin.sendKeys(email);
		}
		
		WebElement textPassword = driver.findElement(CT_Account.TEXT_PASSWORD);
		if(textPassword.isDisplayed()) {
			textPassword.sendKeys(pass);
		}
		
		WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
		if(buttonLogin.isDisplayed()) {
			buttonLogin.click();
		}
	}
}
