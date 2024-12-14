package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;
import automation.page.Day16_CodeStar_LoginPage;
import automation.page.Day16_CodeStar_QLKLVPage;

public class Day16_CodeStar_QLKLVTest extends CommonBase{
	public Day16_CodeStar_LoginPage login;
	public Day16_CodeStar_QLKLVPage quanly;
	
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
		setupDriver(browserName);
		driver.get(CT_PageURL.crmstarURL);
		login = new Day16_CodeStar_LoginPage(driver);
		quanly = new Day16_CodeStar_QLKLVPage(driver);
	}
//	public void openFireFox() {
//		driver = initFireFox(CT_PageURL.crmstarURL);
//		login = new Day16_CodeStar_LoginPage(driver);
//		quanly = new Day16_CodeStar_QLKLVPage(driver);
//	}
	
	@Test(priority = 1)
	public void LoginSuccessfully() {
		login.LoginFunction("thinhthinh1703@gmail.com", "12345678");
		assertTrue(isElementPresent(By.id("dropdownMenuLink")));
	}
	
	@Test(priority = 2)
	public void ThemKLVSuccessfully() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionSuccessfully("8386", "KINGVIP1");
		quanly.TimKLVFunction("KINGVIP1");
		assertTrue(isElementPresent(By.xpath("//td[text()='KINGVIP1']")));
	}
	
	@Test(priority = 3)
	public void XoaKLVSuccessfully() {
		LoginSuccessfully();
		quanly.TimKLVFunction("KINGVIP1");
		assertTrue(isElementPresent(By.xpath("//td[text()='KINGVIP1']")));
		quanly.XoaKLVFunction();
		assertTrue(isElementPresent(By.xpath("//h4[text()='Không tìm thấy kết quả']")));
	}
	
	@Test(priority = 4)
	public void ThemKLVFail_EmptyMaKVLV() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("", "KINGVIP2");
		assertTrue(isElementPresent(By.xpath("//div[text()='Không được để trống trường này' and @id='workarea_validate']")));
	}
	
	@Test(priority = 5)
	public void ThemKLVFail_EmptyTenKVLV() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("813", "");
		assertTrue(isElementPresent(By.xpath("//div[text()='Không được để trống trường này' and @id='name_validate']")));
	}
	
	@Test(priority = 6)
	public void ThemKLVFail_EmptyAllFields() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("", "");
		assertTrue(isElementPresent(By.xpath("//div[text()='Không được để trống trường này']")));
	}
	
	@Test(priority = 7)
	public void ThemKLVFail_WrongFomatMaKVLV() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("123#", "KINGVIP2");
		assertTrue(isElementPresent(By.xpath("//div[text()='Dữ liệu nhập vào sai định dạng' and @id='workarea_validate']")));
	}
	
	@Test(priority = 8)
	public void ThemKLVFail_WrongFomatTenKVLV() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("1239", "KINGVIP2#");
		assertTrue(isElementPresent(By.xpath("//div[text()='Dữ liệu nhập vào sai định dạng' and @id='workarea_validate']")));
	}
	
	@Test(priority = 9)
	public void ThemKLVFail_WrongFomatAllFields() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionFail("123#", "KINGVIP2#");
		assertTrue(isElementPresent(By.xpath("//div[text()='Dữ liệu nhập vào sai định dạng']")));
	}
	
	@Test(priority = 10)
	public void ThemKLVFail_ExistsMaKVLV() {
		LoginSuccessfully();	
		quanly.ThemKLVFunctionSuccessfully("8888", "KINGVIP8");
		assertTrue(isElementPresent(By.xpath("//span[text()='Mã khu vực đã tồn tại']")));
	}
	
}
