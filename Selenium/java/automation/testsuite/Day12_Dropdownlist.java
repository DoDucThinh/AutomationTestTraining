package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;


public class Day12_Dropdownlist extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.codeStarCourse);
	}
	
	@Test
	public void chooseAWSOption() throws InterruptedException {
		//Cach1: selecByVisibleText
		Thread.sleep(5000);
		Select courseDropdown = new Select(driver.findElement(By.id("product_categories_filter")));
		courseDropdown.selectByVisibleText(" AWS");
		String text1 = courseDropdown.getFirstSelectedOption().getText();
		System.out.println("courseDropdown.getFirstSelectedOption: " + text1);
		
		
		//Cach2: SelectByValue
		courseDropdown.selectByValue("https://codestar.vn/product-category/lap-trinh-web/");
		String text2 = courseDropdown.getFirstSelectedOption().getText();
		System.out.println("courseDropdown.getFirstSelectedOption: " + text2);
	
		//Cach3: selectByIndex
		courseDropdown.selectByIndex(4);
		String text3 = courseDropdown.getFirstSelectedOption().getText();
		System.out.println("courseDropdown.getFirstSelectedOption: " + text3);
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
