package codetest4;

import java.util.Random;

public class Employee {

	private String employeeID;

	public String getEmployeeID() {
		Random rand = new Random();
		employeeID = "E00" + rand.nextInt(100);
		return employeeID;
	}

}
