package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.Day16_CodeStar_LoginPage;

public class Day16_CodeStar_LoginTest extends CommonBase{
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.crmstarURL);
	}
	
	@Test
	public void LoginSuccessfully() {
		Day16_CodeStar_LoginPage login = new Day16_CodeStar_LoginPage(driver);
		login.LoginFunction("thinhthinh1703@gmail.com", "12345678");
	}
}
