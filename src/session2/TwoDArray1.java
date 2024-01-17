package session2;

public class TwoDArray1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][5];// 3 row and 5 column
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 10;
		arr[0][4] = 20;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 30;
		arr[1][4] = 40;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		arr[2][3] = 50;
		arr[2][4] = 60;
		System.out.println("The two-dimensional array is as follows:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
