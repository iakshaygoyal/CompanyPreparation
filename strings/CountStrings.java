package strings;

import java.util.*;

//Count of strings that can be formed using a, b and c under given constraints
public class CountStrings {

	static int MAX = 1000;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long[][][] dp = new long[MAX + 1][2][3];
		for (int i = 0; i < MAX + 1; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		count(1000, 1, 2, dp);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			System.out.println(dp[n][1][2]);
		}
		scn.close();
	}

	static long count(int n, int bCount, int cCount, long[][][] dp) {
		if (n == 0) {
			return 1;
		}
		if (dp[n][bCount][cCount] != -1) {
			return dp[n][bCount][cCount];
		}

		long retval = 0;
		if (bCount != 0) {
			retval += count(n - 1, bCount - 1, cCount, dp);
		}
		if (cCount != 0) {
			retval += count(n - 1, bCount, cCount - 1, dp);
		}
		retval += count(n - 1, bCount, cCount, dp);
		return dp[n][bCount][cCount] = retval;
	}

}
