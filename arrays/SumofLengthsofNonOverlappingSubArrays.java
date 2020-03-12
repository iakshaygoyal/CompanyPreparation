package arrays;

import java.util.*;

//Sum of Lengths of Non-Overlapping SubArrays
public class SumofLengthsofNonOverlappingSubArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int k = scn.nextInt();

			boolean flag = false;
			int cnt = 0;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] <= k) {
					cnt++;
					if (arr[i] == k) {
						flag = true;
					}
				} else {
					if (flag) {
						ans += cnt;
					}
					flag = false;
					cnt = 0;
				}
			}
			if (flag) {
				ans += cnt;
			}
			System.out.println(ans);
		}
		scn.close();
	}

}
