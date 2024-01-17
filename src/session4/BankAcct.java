package session4;

public class BankAcct {

	protected String ifscCode;
	private String bankName;
	private String branchAddress;

	public BankAcct() {
		System.out.println("BankAcct Constructor is called ");
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
}
