package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class GlobalSQA extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.globalSQA);
	}
	
	@Test
	public void chooseCountryOption() {
		Select countryDropdown = new Select(driver.findElement(By.xpath("//option[text()='Afghanistan']/ancestor::select")));
		//Cach1: Select by visibleText
		countryDropdown.selectByVisibleText("American Samoa");
		String text1 = countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption: " + text1);
		
		//Cach2: Select by value
		countryDropdown.selectByValue("FRA");
		String text2 = countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption: " + text2);
		
		//Cach3: Select by index
		countryDropdown.selectByIndex(241);
		String text3 = countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption: " + text3);
		
	}
}
