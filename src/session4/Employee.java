package session4;

public class Employee {
	float height;
	float weight;
	float waist;
	int employeeId;
	String employeeName;

	Employee(float height, float weight, float waist, int employeeId, String employeeName) {
		this.height = height;
		this.weight = weight;
		this.waist = waist;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}


	public static void main(String[] args) {

		Employee shubham = new Employee(5.6f, 52.5f, 28.5f, 20125, "Shubham");
		System.out.println("shubham's height is : " + shubham.height + " ft");
		System.out.println("shubham's weight is : " + shubham.weight + " kg");
		System.out.println("shubham's waist is : " + shubham.waist);
		System.out.println("shubham's employeeId is : " + shubham.employeeId);
		System.out.println("shubham's employeeName is : " + shubham.employeeName);
	}
}
