package automation.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CommonBase {
	public static WebDriver driver;
	public int initWaitTime = 30;

	public WebDriver initChromeDriver(String URL) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		System.out.println("user.dir is: " + System.getProperty("user.dir"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(initWaitTime, TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver initFireFox(String URL) {
		System.setProperty("webdriver.firefox,driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(initWaitTime, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public WebDriver initEdge(String URL) {
		System.setProperty("webdriver.edge,driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(initWaitTime, TimeUnit.SECONDS);
		return driver;
		
	}
}
