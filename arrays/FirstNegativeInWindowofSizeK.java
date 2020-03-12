package arrays;

import java.util.*;

//First negative integer in every window of size k
public class FirstNegativeInWindowofSizeK {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			int k = scn.nextInt();

			Deque<Integer> deck = new ArrayDeque<Integer>();
			for (int i = 0; i < k; i++) {
				if (arr[i] < 0) {
					deck.offerLast(i);
				}
			}

			for (int i = k; i < n; i++) {
				if (!deck.isEmpty() && arr[deck.peekFirst()] < 0) {
					System.out.print(arr[deck.peekFirst()] + " ");
				} else {
					System.out.print("0 ");
				}
				if (!deck.isEmpty() && deck.peekFirst() <= i - k) {
					deck.pollFirst();
				}
				if (arr[i] < 0) {
					deck.offerLast(i);
				}
			}
			if (!deck.isEmpty() && arr[deck.peekFirst()] < 0) {
				System.out.print(arr[deck.peekFirst()] + " ");
			} else {
				System.out.print("0 ");
			}
			System.out.println();
		}
		scn.close();
	}

}
