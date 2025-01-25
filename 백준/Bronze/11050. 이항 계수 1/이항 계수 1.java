import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result = factorial(n)/(factorial(k)*factorial(n-k));
		
		bw.write(result+"");
		
		
    
		bw.close();
		br.close();
	}
	
	public static int factorial(int num){
	    if(num == 1 || num == 0){
	        return 1;
	    }
	    
	    return num * factorial(num-1);
	}
}
