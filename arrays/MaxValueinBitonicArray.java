package arrays;

import java.util.*;

//Maximum value in a bitonic array
public class MaxValueinBitonicArray {

	static int n;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int idx = findPivot(arr, 0, n - 1);
			if (idx != -1) {
				System.out.println(arr[idx]);
			} else {
				System.out.println("-1");
			}
		}
		scn.close();
	}

	static int findPivot(int[] arr, int si, int ei) {
		if (si > ei) {
			return -1;
		}

		if (si == ei) {
			return si;
		}
		int mid = (si + ei) / 2;
		if (mid > 0 && mid < n && arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (mid > 0 && arr[mid - 1] < arr[mid]) {
			return findPivot(arr, mid + 1, ei);
		} else {
			return findPivot(arr, si, mid - 1);
		}
	}

}
