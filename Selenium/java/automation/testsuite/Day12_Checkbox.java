package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class Day12_Checkbox extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.demoQA);
	}

	//@Test
	public void clickOneCheckbox() {
		WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
		try {
			if(sportCheckbox.isSelected() == false) {
				sportCheckbox.click();
				System.out.println("Đã chọn Sports");
			}else {
				System.out.println("Checkbox đã được chọn mặc định");
			}
		} catch (Exception e) {
			WebElement labelCheckbox1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
			labelCheckbox1.click();
		}
		
	}
	
	@Test
	public void clickOneRadio() {
		try {
			WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
			maleRadio.click();
			System.out.println("Đã click vào Male");
		} catch (Exception e) {
			WebElement labelRadio = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
			labelRadio.click();
		}
		
		
	}
	
	@Test
	public void checkDefaultRadioButton() {
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		WebElement femaleRadio = driver.findElement(By.id("gender-radio-2"));
		WebElement otherRadio = driver.findElement(By.id("gender-radio-3"));
		System.out.println("Male radio button selected: " + maleRadio.isSelected());
		System.out.println("Female radio button selected: " + femaleRadio.isSelected());
		System.out.println("Other radio button selected: " + otherRadio.isSelected());
	}
}
