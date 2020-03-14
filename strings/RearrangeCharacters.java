package strings;
import java.util.*;

public class RearrangeCharacters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t--!=0) {
			String s = scn.next();
			
			if(isPosssible(s)) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		scn.close();
	}
	
	static class Node implements Comparable<Node>{
		char c;
		int count;
		
		Node(char c, int count){
			this.c = c;
			this.count = count;
		}
		
		public int compareTo(Node node) {
			return node.count - this.count;
		}
	}
	
	static boolean isPosssible(String s) {
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i) - 'a']++;
		}
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i=0;i<26;i++) {
			if(arr[i] > 0) {
				pq.offer(new Node((char)(i + 'a'), arr[i]));
			}
		}
		Node prev = new Node('$', -1);
		String res = "";
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			res +=node.c;
			node.count--;
			if(prev.count > 0) {
				pq.offer(prev);
			}
			prev = node;
		}
		
		if(s.length() == res.length()) {
			return true;
		}
		return false;
	}
	
}
