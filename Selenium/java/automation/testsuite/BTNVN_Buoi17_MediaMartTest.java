package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTNVN_Buoi17_MediaMartTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.MEDIAMART);
	}
	
	//Bai1
	@Test(priority = 1)
	public void messengerIframe() {
		if(isElementPresent(By.xpath("//div[text()='Công ty CP MediaMart Việt Nam']")));
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
		assertTrue(isElementPresent(By.xpath("//button[text()='Tiếp tục chat']")));
	}
	
	//Bai2
	@Test(priority = 2)
	public void iFrameZalo() {
		if(isElementPresent(By.xpath("//div[text()='Gửi tin nhắn']")));
		click(By.xpath("//div[@class='widget-preview--btn-close']"));
		driver.switchTo().frame(0);
		click(By.xpath("//div[@class='logo']"));
		assertTrue(isElementPresent(By.xpath("//h1[text()='Xin chào!']")));;
	}
}
