package strings;

import java.util.*;

//Number following a pattern
public class MinimumNoFollowingPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			String s = scn.next();

			String res = "";
			Stack<Integer> stk = new Stack<>();
			for (int i = 0; i <= s.length(); i++) {
				stk.push(i + 1);
				if (i == s.length() || s.charAt(i) == 'I') {
					while (!stk.isEmpty()) {
						res += stk.pop();
					}
				}
			}
			System.out.println(res);
		}
		scn.close();
	}

}
