package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.BTVN_B14_Alada_SignUpPage;

public class BTVN_B14_Alada_SignUpTest extends CommonBase {
	@BeforeMethod
	public void openFireFox() {
		driver = initFireFox(CT_PageURL.aladaBTVNB14);
	}
	
	@Test(priority = 1)
	public void SignUpSuccessfully() throws InterruptedException {
		BTVN_B14_Alada_SignUpPage signUp = new BTVN_B14_Alada_SignUpPage(driver);
		signUp.SignUp("Thinh", "thinhthinh1708@gmail.com", "thinhthinh1708@gmail.com", "123456", "123456", "0961098456");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
	}
}
