package strings;
import java.util.*;

//Match specific pattern
public class MatchSpecificPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t--!=0) {
			int n = scn.nextInt();
			List<String> dict = new ArrayList<>();
			for(int i=0;i<n;i++) {
				dict.add(scn.next());
			}
			String pattern = scn.next();
			
			System.out.println(findMatchedWords(dict, pattern));
		}
		scn.close();
	}
	
	public static List<String> findMatchedWords(List<String> dict, String pattern){
		List<String> retval = new ArrayList<>();
		String encodedPattern = encode(pattern);
		for(String s : dict) {
			String encodedString = encode(s);
			if(pattern.length() == s.length() && encodedPattern.equals(encodedString)) {
				retval.add(s);
			}
		}
		return retval;
	}
	
	public static String encode(String s) {
		String res = "";
		Map<Character, Integer> map = new HashMap<>();
		int j = 0;
		for(int i=0;i<s.length();i++) {
			Character c = s.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, j++);
			}
			res += map.get(c);
			res += " ";
		}
		return res;
	}
	
}

