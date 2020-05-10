package arrays;
import java.util.*;

public class LargestNumberFormedfromanArray {
	public static void main (String[] args){
	    Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    for(int i=0;i<t;i++){
	        int n = scn.nextInt();
	        String[] arr = new String[n];
	        for(int j=0;j<n;j++){
	            arr[j] = scn.next();
	        }
	        
	        Arrays.sort(arr, new Comparator<String>(){
	           public int compare(String s1, String s2){
	               String x1 = s1 + s2;
	               String x2 = s2 + s1;
	               return x2.compareTo(x1);
	           } 
	        });
	        String ans = new String();
	        for(int j=0;j<n;j++) {
	        	ans += arr[j];
	        }
	        System.out.println(ans);
	    }
	    scn.close();
	}
}
