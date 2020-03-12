package arrays;

import java.util.*;

//Kth smallest element
public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++) {
				pq.offer(scn.nextInt());
			}
			int k = scn.nextInt();

			int ans = -1;
			for (int i = 0; i < k; i++) {
				ans = pq.poll();
			}
			System.out.println(ans);
		}
		scn.close();
	}

}
