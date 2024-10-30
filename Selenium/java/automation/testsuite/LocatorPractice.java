package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class LocatorPractice extends CommonBase {
	@BeforeMethod
	public void openChrome() {
//		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
		driver = initChromeDriver("https://bepantoan.vn/");
	}
	
	@Test
	public void getLocatorSelectorHub() {
		WebElement useName = driver.findElement(By.name("email"));
		System.out.println("use name is: " + useName);
		
		WebElement passWord = driver.findElement(By.name("Password"));
		System.out.println("password is: " + passWord);
		
		WebElement company = driver.findElement(By.name("company"));
		System.out.println("company is: " + company);
		
		WebElement mobileNumber = driver.findElement(By.name("mobile number"));
		System.out.println("mobile number is: " + mobileNumber);
	}
	
	@Test
	public void getLocatorBepAnToan() {
		WebElement linkBepTu = driver.findElement(By.linkText("Bếp Từ"));
		System.out.println("link Bep Tu is: " + linkBepTu);
		
		WebElement linkMayHutMui = driver.findElement(By.linkText("Máy Hút Mùi"));
		System.out.println("link May Hut Mui is: " + linkMayHutMui);
		
		WebElement linkMayRuaChenBat = driver.findElement(By.partialLinkText("Máy Rửa Chén"));
		System.out.println("link May Rua Chen Bat is: " + linkMayRuaChenBat);
	}
}
