package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage_Day14 {
	private WebDriver driver;
	@FindBy(xpath = "//button[text()='Thêm mới']")
	WebElement btnThemMoi;
	@FindBy(name = "username")
	WebElement textHoVaTen;
	@FindBy(name = "email")
	WebElement textEmail;
	@FindBy(name = "phone_number")
	WebElement textSoDienThoai;
	@FindBy(name = "department_id")
	WebElement dropdownPhongBan;
	@FindBy(name = "role_id")
	WebElement dropdownChucDanh;
	@FindBy(name = "workarea_id")
	WebElement dropdownKhuVucLamViec;
	@FindBy(name = "code_user")
	WebElement textMaNguoiDung;
	@FindBy(xpath = "//button[text()='Lưu']")
	WebElement btnLuu;
	@FindBy(xpath = "//button[text()='Thêm'] ")
	WebElement btnThem;
	
	public UserManagementPage_Day14(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//add User
	public void addUser(String hoVaTen, String email, String soDienThoai, String phongBan, String chucDanh, String khuVucLamViec, String maNguoiDung) {
		btnThemMoi.click();
		textHoVaTen.sendKeys(hoVaTen);
		textEmail.sendKeys(email);
		textSoDienThoai.sendKeys(soDienThoai);
		Select selectPhongBan = new Select(dropdownPhongBan);
		selectPhongBan.selectByValue(phongBan);
		Select selectChucDanh = new Select(dropdownChucDanh);
		selectChucDanh.selectByValue(chucDanh);
		Select selectKhuVucLamViec = new Select(dropdownKhuVucLamViec);
		selectKhuVucLamViec.selectByValue(khuVucLamViec);
		textMaNguoiDung.sendKeys(maNguoiDung);
		btnLuu.click();
		btnThem.click();
	}

	
}
