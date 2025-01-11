import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		
		int n = Integer.parseInt(br.readLine());
		int result = n;
		
		if(n==0){
		    result = 1; 
		}else{
		    for(int i=n-1 ; i>=1 ; i--){
		        result *= i;
		    }
		}
		
		bw.write(Integer.toString(result));
		
		
		bw.close();
		br.close();
	}
}
