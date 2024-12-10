package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day17_IFrame extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.CODE_STAR);
	}
	
	@Test
	public void dangKyNhanTuVanLoTrinh_ThatBai_ThieuEmail() {
		scrollToElement(By.xpath("//h2[contains(text(),'AWS/Kiểm thử/Lập trình web')]"));
		driver.switchTo().frame(1);
		type(By.id("name"), "autotest user");
		type(By.id("phone_number"), "0961098469");
		type(By.id("email"), "");
		click(By.xpath("//button[normalize-space()='Gửi ngay']"));
		assertTrue(isElementPresent(By.xpath("//button[normalize-space()='Gửi ngay']")));
	}
}
