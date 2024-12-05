package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class Day16_CodeStar_LoginPage extends CommonBase{
	private WebDriver driver;
	
	public Day16_CodeStar_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		
	}

	public void LoginFunction(String email, String password) {
		type(By.id("email"), email);
		type(By.id("password"), password);
		click(By.name("signin"));
	}
}
