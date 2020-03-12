package strings;

import java.util.*;

//CountOccurencesofAnagrams
public class CountOccurencesofAnagrams {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			String text = scn.next();
			String pattern = scn.next();

			System.out.println(countOccurences(text, pattern));
		}
		scn.close();
	}

	static int countOccurences(String text, String pattern) {
		int[] count_arr = new int[26];
		int m = text.length();
		int n = pattern.length();
		for (int i = 0; i < n; i++) {
			count_arr[text.charAt(i) - 'a']++;
			count_arr[pattern.charAt(i) - 'a']--;
		}
		int retval = 0;
		if (areAllZeroes(count_arr)) {
			retval++;
		}
		for (int i = n; i < m; i++) {
			count_arr[text.charAt(i - n) - 'a']--;
			count_arr[text.charAt(i) - 'a']++;
			if (areAllZeroes(count_arr)) {
				retval++;
			}
		}

		return retval;
	}

	static boolean areAllZeroes(int[] count_arr) {
		for (int i = 0; i < 26; i++) {
			if (count_arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
