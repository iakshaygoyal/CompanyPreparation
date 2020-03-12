package strings;

import java.util.*;

//DecodePattern
public class DecodePattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			System.out.println(getPattern(n));
		}
		scn.close();
	}

	static String getPattern(int n) {
		String s = "1";
		String res = "";
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			s += '$';
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.charAt(j) == s.charAt(j + 1)) {
					cnt++;
				} else {
					res = res + cnt + s.charAt(j);
					cnt = 1;
				}
			}
			s = res;
			res = "";
		}
		return s;
	}

}
