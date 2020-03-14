package arrays;
import java.util.*;

public class BinarytoHexadecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = "0123456789ABCDEF";
		char[] arr = s.toCharArray();
		int t = scn.nextInt();
		while(t--!=0) {
			int n = scn.nextInt();
			StringBuffer res = new StringBuffer();
			
			while(n > 0) {
				res.append(arr[n % 16]);
				n /= 16;
			}
			
			System.out.println(res.reverse());
		}
		scn.close();
	}
	
}
