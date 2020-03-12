package arrays;

import java.util.*;

//Count pairs with given sum
public class CountPairWithGivenSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (map.containsKey(k - arr[i])) {
					ans += map.get(k - arr[i]);
				}
				if (arr[i] + arr[i] == k) {
					ans--;
				}
			}
			ans /= 2;
			System.out.println(ans);
		}
		scn.close();
	}

}
