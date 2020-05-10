package arrays;
import java.util.*;
import java.io.*;
class GFG{
    
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
	    for(int i=0;i<t;i++){
	        int n = scn.nextInt();
	        long[] arr = new long[n];
	        for(int j=0;j<n;j++){
	            arr[j] = scn.nextLong();
	        }
	        
	        long curr_max = 1;
	        long curr_min = 1;
	        long final_max = Integer.MIN_VALUE;
	        for(int j=0;j<n;j++){
	            if(arr[j] < 0){
	                long temp = curr_max;
	                curr_max = curr_min;
	                curr_min = temp;
	            }
	            curr_max = Math.max(arr[j], arr[j] * curr_max);
	            curr_min = Math.min(arr[j], arr[j] * curr_min);
	            final_max = Math.max(final_max, curr_max);
	        }
	        op.print(Long.toString(final_max) + "\n");
	    }
	    op.close();
	}
}