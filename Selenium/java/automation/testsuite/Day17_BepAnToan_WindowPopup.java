package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day17_BepAnToan_WindowPopup extends CommonBase {
	@BeforeMethod
	public void openFireFox() {
		driver = initChromeDriver(CT_PageURL.BEP_AN_TOAN);
	}

	@Test
	public void handleMessagerWindowPopup() {
		String mainWindow = null;
		if (isElementPresent(By.xpath("//input[@placeholder='Tìm sản phẩm bạn mong muốn...']"))) {
			mainWindow = driver.getWindowHandle();
			click(By.xpath("(//span[text()='Chat với chúng tôi'])[1]"));
		}

		Set<String> listWindowns = driver.getWindowHandles();

		for (String window : listWindowns) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				if(isElementPresent(By.id("email")));
				assertEquals(driver.getTitle(), "Messenger");
				type(By.id("email"), "vietdungcg2001@gmail.com");
				type(By.id("pass"), "thinhthinhthinh123");
				click(By.id("loginbutton"));
				
				assertTrue(isElementPresent(By.xpath("//div[text()='Please re-enter your password']")));
			
			}
		}
	}
}
