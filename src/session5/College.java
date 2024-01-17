package session5;

public class College {
	String clgName;
	String clgAddr;
	private int clgFees;

	public void setClgFees(int clgFees) {
		this.clgFees = clgFees;
	}

	public int getClgFees() {
		return clgFees;
	}

	College(String clgName, String clgAddr, int clgFees) {
		this.clgName = clgName;
		this.clgAddr = clgAddr;	
		this.clgFees = clgFees;
	}

	public static void main(String[] args) {
		College mycollege = new College("S K Somaiya", "Vidyavihar", 35000);
		mycollege.setClgFees(50000);
		System.out.println(mycollege.clgName);
		System.out.println(mycollege.clgAddr);
		System.out.println(mycollege.clgFees);
		System.out.println(mycollege.getClgFees());
	}
}
