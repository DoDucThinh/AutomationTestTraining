package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
	//Chứa các locator của element trên toàn bộ các trang cần test
	//Nếu locator bị thay đổi, test vào class này để thay đổi giá trị xPath
	
	public static By TEXT_EMAIL = By.id("txtLoginUsername");
	public static By TEXT_PASSWORD = By.id("txtLoginPassword");
	public static By BUTTON_LOGIN = By.xpath("//button[text()='ĐĂNG NHẬP' and contains(@class,'btn btn-lg')] ");
}
