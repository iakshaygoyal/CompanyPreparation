package strings;
import java.util.*;

//Count subsequences of type a^i, b^j, c^k
public class CountSubsequences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t--!=0) {
			String s = scn.next();
			System.out.println(countOccurences(s));
		}
		scn.close();
	}
	
	public static int countOccurences(String s){
        int aCount=0, bCount=0, cCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                aCount = 1 + 2 * aCount;
            }
            else if(s.charAt(i) == 'b'){
                bCount = aCount + 2 * bCount;
            }
            else if(s.charAt(i) == 'c'){
                cCount = bCount + 2 * cCount;
            }
        }
        return cCount;
    }
	
}
