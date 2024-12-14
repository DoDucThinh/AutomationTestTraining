package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_Buoi18_DienMayNhapKhauGiaReTest extends CommonBase{
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
		setupDriver(browserName);
		driver.get(CT_PageURL.DIEN_MAY_NHAP_KHAU_GIA_RE);
	}
	
	@Test
	public void handleZaloWindowPopup() {
		String mainWindow = null;
		if(isElementPresent(By.xpath("//input[@placeholder='Nhập sản phẩm tìm kiếm...']"))) {
			mainWindow = driver.getWindowHandle();
			click(By.xpath("//img[@alt='Zalo']"));
		}
		
		Set<String> listWindows = driver.getWindowHandles();
		for (String window : listWindows) {
			if(!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				assertTrue(isElementPresent(By.xpath("//a[@class='logo']")));
			}
		}
	}
}
