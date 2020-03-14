package strings;

import java.util.*;

//Remove all duplicates from a given string
public class RemoveDuplicatesfromString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scn.next();

			String res = "";
			for (int j = 0; j < s.length(); j++) {
				if (res.indexOf(s.charAt(j)) == -1) {
					res += s.charAt(j);
				}
			}

			System.out.println(res);
		}
		scn.close();
	}
}
