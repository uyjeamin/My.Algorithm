import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
	
		bw.write(factorial(n)+"");
    
		bw.close();
		br.close();
	}
	
		
		public static long factorial(int x){
		    if(x == 1 || x == 0){
		        return 1;
		    }
		    return x*factorial(x-1);
		    
		}
}
