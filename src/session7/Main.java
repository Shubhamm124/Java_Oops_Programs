package session7;

public class Main {

	public static void main(String[] args) {
		DomesticBill dbill = new DomesticBill();
		CommercialBill cbill = new CommercialBill();

		long val1 = dbill.calculateUnitCnsume(10123, 9965);
		long val2 = cbill.calculateUnitCnsume(11589, 11012);
		long val3 = dbill.calculateUnitCnsume(9653, 9163);
		long val4 = cbill.calculateUnitCnsume(9579, 9127);

		long amount1 = dbill.billAmount(val1);
		long amount2 = cbill.billAmount(val2);
		long amount3 = dbill.billAmount(val3);
		long amount4 = dbill.billAmount(val4);

		System.out.println("The amount is : " + amount1 + " rs");
		System.out.println("The amount is : " + amount2 + " rs");
		System.out.println("The amount is : " + amount3 + " rs");
		System.out.println("The amount is : " + amount4 + " rs");
	}

}
