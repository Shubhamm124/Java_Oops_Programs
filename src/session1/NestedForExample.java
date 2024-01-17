package session1;

public class NestedForExample {
	public static void main(String[] args) {
		// loop of i
		int tempVar = 1;
		for (int i = 1; i <= 3; i++) {
			
			// loop of j
			for (int j = 1; j <= 3; j++) {
				System.out.print(tempVar);
				tempVar = tempVar + 1;
			} // end of i
			System.out.println();
		} // end of j
	}
}