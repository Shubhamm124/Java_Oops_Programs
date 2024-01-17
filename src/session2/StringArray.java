package session2;

public class StringArray {
	public static void main(String[] args) {
		int[] fruitsPrice = {50, 60, 70};
		int totalPrice = 0;
		System.out.print("The Average Price Of the Fruits is: ");
		for(int i = 0; i<fruitsPrice.length; i++) {
			totalPrice = totalPrice + fruitsPrice[i];
		}
		int averagePrice = totalPrice/3;
		System.out.print(averagePrice);
	}
}