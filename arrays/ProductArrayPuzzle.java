package arrays;
import java.util.*;
import java.io.*;

//Product array puzzle
public class ProductArrayPuzzle {

	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	static class OutputWriter{
		  BufferedWriter writer;
		 
		  public OutputWriter(OutputStream stream){
		    writer = new BufferedWriter(new OutputStreamWriter(stream));
		  }
		 
		  public void print(int i) throws IOException {
		    writer.write(i);
		  }
		 
		  public void print(String s) throws IOException {
		    writer.write(s);
		  }
		 
		  public void print(char []c) throws IOException {
		    writer.write(c);
		  }
		  public  void close() throws IOException {
		    writer.close();
		  }
	}
    
	public static void main (String[] args) throws IOException{
	    FastReader scn = new FastReader();
	    OutputWriter op = new OutputWriter(System.out);
	    int t = scn.nextInt();
	    while(t-- != 0){
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = scn.nextInt();
	        }
	        
	        int[] res = new int[n];
	        Arrays.fill(res, 1);
	        int temp = 1;
	        for(int i=0;i<n;i++){
	            res[i] *= temp;
	            temp *= arr[i];
	        }
	        
	        temp = 1;
	        for(int i=n-1;i>=0;i--){
	            res[i] *= temp;
	            temp *= arr[i];
	        }
	        
	        for(int i=0;i<n;i++){
	            op.print(res[i] + " ");
	        }
	        op.print("\n");
	    }
	    op.close();
	}

}
