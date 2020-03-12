package arrays;

import java.util.*;

//Count the Zeros
public class CountZeroes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int pivot_idx = firstOccurenceOfOne(arr, 0, n - 1);
			if (pivot_idx == -1) {
				if (arr[0] == 0) {
					System.out.println(n);
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(n - pivot_idx);
			}
		}
		scn.close();
	}

	static int firstOccurenceOfOne(int[] arr, int si, int ei) {
		if (si > ei) {
			return -1;
		}

		int mid = (si + ei) / 2;
		if (mid > 0 && arr[mid - 1] == 1 && arr[mid] == 0) {
			return mid;
		}
		if (arr[mid] == 1) {
			return firstOccurenceOfOne(arr, mid + 1, ei);
		} else {
			return firstOccurenceOfOne(arr, si, mid - 1);
		}
	}

}
