package arrays;

import java.util.*;

//Merge k Sorted Arrays
class MergeKSortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();

			ArrayList<Integer> arr = mergeKArrays(a, n);
			printArray(arr, n * n);
		}
		sc.close();
	}

	static class Node implements Comparable<Node> {
		int val, i, j;

		Node(int val, int i, int j) {
			this.val = val;
			this.i = i;
			this.j = j;
		}

		public int compareTo(Node node) {
			return this.val - node.val;
		}
	}

	public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k) {
		int n = arrays[0].length;
		ArrayList<Integer> retval = new ArrayList<>();
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.offer(new Node(arrays[i][0], i, 1));
		}
		for (int i = 0; i < k * n; i++) {
			Node node = pq.poll();
			retval.add(node.val);
			if (node.j < n) {
				pq.offer(new Node(arrays[node.i][node.j], node.i, node.j + 1));
			}
		}
		return retval;
	}

	public static void printArray(ArrayList<Integer> arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr.get(i) + " ");
		System.out.println();
	}
}