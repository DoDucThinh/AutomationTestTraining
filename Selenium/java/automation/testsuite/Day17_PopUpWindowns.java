package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day17_PopUpWindowns extends CommonBase{
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
		setupDriver(browserName);
		driver.get(CT_PageURL.demoGuroPopUpWindows);
	}
//	public void openFireFox() {
//		driver = initFireFox(CT_PageURL.demoGuroPopUpWindows);
//	}
	
	@Test
	public void handleWindown() {
		String mainWindow = null;
		if(isElementPresent(By.xpath("//a[text()='Click Here']"))) {
			mainWindow = driver.getWindowHandle();
			click(By.xpath("//a[text()='Click Here']"));
		}
		//lấy hết các windows
		
		Set<String> listWindowns = driver.getWindowHandles();
		
		for (String window : listWindowns) {
			if(!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				if(isElementPresent(By.name("emailid")));
				assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/articles_popup.php");
				
				type(By.name("emailid"), "thinhthinh1703@gmail.com");
				click(By.name("btnLogin"));
				
				assertTrue(isElementPresent(By.xpath("//h2[text()='Access details to demo site.']")));
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Đã chuyển về main window thành công");
	}
}
