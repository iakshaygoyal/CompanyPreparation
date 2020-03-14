package strings;
import java.util.*;

//Print Bracket Number
public class PrintBracketNumber {

	public static void main (String[] args){
	    Scanner scn = new Scanner(System.in);
	    int t = scn.nextInt();
	    while(t-- != 0){
	        String s = scn.next();
	        
	        Stack<Integer> stk = new Stack<>();
	        int cnt = 0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) == '('){
	                cnt++;
	                System.out.print(cnt + " ");
	                stk.push(cnt);
	            }
	            else if(s.charAt(i) == ')'){
	                System.out.print(stk.pop() + " ");
	            }
	        }
	        System.out.println();
	    }
	    scn.close();
	}
	
}
