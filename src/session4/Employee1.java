package session4;

public class Employee1 {
	public String empId;
	private int salary;
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	String empName;

	public void displayId() {
		System.out.println(empId);
	}

	private void displaySalary() {
		System.out.println(salary);
	}

	void displayeEmpName() {
		System.out.println(empName);
	}
}