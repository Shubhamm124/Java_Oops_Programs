package session2;

public class OneDArray {
	public static void main(String[] args) {
		// declares an Array of integers.
		int[] arr, brr;

		// declare & initialize an Array of Integers at the same place itself
		int[] crr = { 1, 2, 3 };

		// allocating memory for 5 integers.
		arr = new int[6];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Values are : " + arr[i]);
	}

}
