package arrays;

import java.util.*;

//Rotate a 2D array without using extra space
public class Rotate2DArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = scn.nextInt();
				}
			}

			// transpose of the array
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}

			// exchange columns
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n / 2; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][n - j - 1];
					arr[i][n - j - 1] = temp;
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		scn.close();
	}

}
