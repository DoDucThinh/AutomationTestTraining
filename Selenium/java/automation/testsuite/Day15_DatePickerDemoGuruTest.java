package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.Day15_DatePickerDemoGuruPage;

public class Day15_DatePickerDemoGuruTest extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURL.demoGuru);
	}
	
	@Test
	public void chooseDatePicker() {
		Day15_DatePickerDemoGuruPage datePicker = new Day15_DatePickerDemoGuruPage(driver);
		datePicker.chooseDatePickerPage("2024-12-25T10:30");
	}
}
