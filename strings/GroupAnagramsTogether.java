package strings;

import java.util.*;

//Group Anagrams Together
public class GroupAnagramsTogether {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- != 0) {
			int n = scn.nextInt();
			String[] arr = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.next();
			}

			Map<String, List<String>> map = new HashMap<>();
			for (String s : arr) {
				char[] char_arr = s.toCharArray();
				Arrays.sort(char_arr);
				String s2 = new String(char_arr);
				if (map.containsKey(s2)) {
					map.get(s2).add(s);
				} else {
					List<String> list = new ArrayList<>();
					list.add(s);
					map.put(s2, list);
				}
			}
			List<Integer> list = new ArrayList<Integer>();
			for (String s : map.keySet()) {
				list.add(map.get(s).size());
			}
			Collections.sort(list);
			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scn.close();
	}

}
