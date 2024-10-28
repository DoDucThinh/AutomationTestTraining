package automation.testsuite;

import java.util.ArrayList;
import java.util.Scanner;
import org.testng.annotations.Test;

public class Employee {

	@Test
	public void nhanVien() {
		ArrayList<String> employeeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập số lượng nhân viên: ");
		int size = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < size; i++) {
			System.out.println("Tên của nhân viên thứ " + (i + 1) + " là: ");
			String name = sc.nextLine();
			employeeList.add(name);
		}

		System.out.println("\nDanh sách tên nhân viên:");
		int index = 1;
		for (String name : employeeList) {
			System.out.println("Nhân viên thứ " + index + " tên là: " + name);
			index++;
		}

		sc.close();

	}
}
