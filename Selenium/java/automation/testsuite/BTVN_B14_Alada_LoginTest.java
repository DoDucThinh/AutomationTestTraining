package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.BTVN_B14_Alada_LoginPage;

public class BTVN_B14_Alada_LoginTest extends CommonBase{
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.aladaBTVNB14);
	}
	
	@Test
	public void LoginSuccessfully() {
		BTVN_B14_Alada_LoginPage login = new BTVN_B14_Alada_LoginPage(driver);
		login.Login("thinhthinh1708@gmail.com", "123455");
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']"))
				.isDisplayed());
	}
}
