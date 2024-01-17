package session1;

public class Demo {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
//			System.out.println("Outside loop: i = " + i);
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}