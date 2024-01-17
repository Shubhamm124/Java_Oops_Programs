package session5;

public class Main {

	public static void main(String[] args) {
		College mycollege1 = new College("Rj", "Ghatkopar West", 47000);
		mycollege1.setClgFees(53000);
		System.out.println(mycollege1.clgName);
		System.out.println(mycollege1.clgAddr);
//		System.out.println(mycollege.clgFees);
		System.out.println(mycollege1.getClgFees());

	}

}
