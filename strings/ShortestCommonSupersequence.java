package strings;
import java.util.*;

//Shortest Common Supersequence
public class ShortestCommonSupersequence {

	public static void main (String[] args){
	    Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    while(t-- != 0){
	        String s1 = scn.next();
	        String s2 = scn.next();
	        
	        int m = s1.length();
	        int n = s2.length();
	        int[][] dp = new int[m + 1][n + 1];
	        for(int i=m-1;i>=0;i--){
	            for(int j=n-1;j>=0;j--){
	                if(s1.charAt(i) == s2.charAt(j)){
	                    dp[i][j] = 1 + dp[i + 1][j + 1];
	                }
	                else{
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
	                }
	            }
	        }
	        System.out.println(m + n - dp[0][0]);
	    }
	    scn.close();
	}
	
}
