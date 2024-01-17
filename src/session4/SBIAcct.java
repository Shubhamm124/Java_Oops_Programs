package session4;

public class SBIAcct extends BankAcct {
	public SBIAcct() {
		System.out.println("SBIAcct Constructor is called ");
	}

	public static void main(String[] args) {

		SBIAcct sbiandheriAcct = new SBIAcct();
//Below methods inherited from BankAcct Class
		sbiandheriAcct.setBankName("SBI");
		sbiandheriAcct.setBranchAddress("Andheri");
		
		System.out.println(sbiandheriAcct.ifscCode);
//		System.out.println(sbiandheriAcct.bankName);
//		System.out.println(sbiandheriAcct.branchAddress);
	}
}