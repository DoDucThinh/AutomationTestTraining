package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	@BeforeMethod
	public void init() {
		System.out.println("This is before method");
	}
	
	@Test
	public void testcase1() {
		System.out.println("This is test case 1");
	}
}