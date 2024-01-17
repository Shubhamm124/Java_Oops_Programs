package session3;

public class Student {
	String studName, studStd, studSchoolName;
	
	Student(String[] studentdata)
	{
		this.studName = studentdata[0];
		this.studStd = studentdata[1];
		this.studSchoolName = studentdata[2];
	}

	public static void main(String[] args) {
		String studName = "Shubham";
		String studStd = "10th/A";
		String studSchoolName = "Samata Vidya Mandir";
		
		String[] studentdata = {studName, studStd, studSchoolName};
		
		Student shubham = new Student(studentdata);
		
		System.out.println("Student name is : " + shubham.studName);
		System.out.println("Student Standard is : " + shubham.studStd);
		System.out.println("Student School Name is : " + shubham.studSchoolName);
		
	}
}
