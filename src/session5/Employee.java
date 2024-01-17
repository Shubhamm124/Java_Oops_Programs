package session5;

public class Employee {
	float height, weight, waist;
	Employee(float[] bodyData)
	{
		this.height = bodyData[0];
		this.weight = bodyData[1];
		this.waist = bodyData[2];
	}

	public static void main(String[] args) {
		float height = 5.7f;
		float weight = 59.5f;
		float waist = 28.0f;
		
		float color = 5.7f;
		float shape = 59.5f;
		float size = 28.0f;
		
		float[] bodyData = {height, weight, waist};
		float[] bodyInfo = {color, shape, size};
		
		Employee amol = new Employee(bodyData);
		Employee shubham = new Employee(bodyInfo);
		
		System.out.println(bodyData[0]);
		System.out.println(bodyData[1]);
		System.out.println(bodyData[2]);
		
		System.out.println("shubham's height is : " + shubham.height);
		System.out.println("amol's height is : " + amol.height);
		
		
	}
}
