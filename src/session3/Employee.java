package session3;

public class Employee {
	static String officeAdd = "Ghatkopar west mumbai-400084";
	
	String emplName;
	String emplRole;
	String emplAge;
	
	public int calculateSalary(int perdaysal, int attendance, int allowedLeaves) {
		int salary = perdaysal*(attendance + allowedLeaves); 
		return salary;
	}
	
	public float calculateIncomeTax(float sal) {
		float intax = 0.0f;

		if(sal>30000.0f) {
			intax = sal*(30.0f/100.0f);
		}
		else if(sal>20000 && sal<30000) {
			intax = sal/5;
		}
		else if(sal<20000) {
			intax = sal/10;
		}
		return intax;
	}
	
	public float calculatePf(float payment) {
		float pf = 0.0f;
		if(payment<20000.0f) {
			pf = payment/50.0f;
		}else if(payment>30000.0f) {
			pf = payment*(7.0f/100.0f);
		}
		else if(payment>20000.0f) {
			pf = payment/25.0f;
		}
		return pf;
	}
	
	
	public static void main(String[] args) {
		// Create Objects of Employee
		Employee shubham = new Employee();
		Employee amit = new Employee();
		Employee shashi = new Employee();
		
		
		float sal1 = shubham.calculateSalary(2000, 25, 2);
		int sal2 = amit.calculateSalary(1500, 20, 4);
		int sal3 = shashi.calculateSalary(1200, 20, 2);
		
		System.out.println("Salary of shubham is : " + sal1);
		System.out.println("Salary of amit is : " + sal2);
		System.out.println("Salary of shashi is : " + sal3);
		
		float tax1 = shubham.calculateIncomeTax(sal1);
		float tax2 = amit.calculateIncomeTax(sal2);
		float tax3 = shashi.calculateIncomeTax(sal3);
		
		System.out.println("tax of shubham is : " + tax1);
		System.out.println("tax of amit is : " + tax2);
		System.out.println("tax of shashi is : " + tax3);
		
		float pf1 = shubham.calculatePf(sal1);
		float pf2 = shubham.calculatePf(sal2);
		float pf3 = shubham.calculatePf(sal3);
		
		System.out.println("pf of shubham is : " + pf1);
		System.out.println("pf of amit is : " + pf2);
		System.out.println("pf of shashi is : " + pf3);

	}

}