import java.io.*;
import java.util.*;

public class Main
{
    static int[] arr;
    static int n;
    static int count = 0;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
	    
	    nQuean(0);
		
		
		bw.write(count+"");
	        
		bw.close();
		br.close();
	}
	
	public static void nQuean(int depth) {
	    
	    if (depth == n) {
	        count++;
	        return ;
	    }
	    
	    for (int i=0 ; i<n ; i++) {
	        arr[depth] = i; 
	        
	        if (possibility(depth)) {
	            nQuean(depth+1);
	        }
	    }
	}
	
	public static boolean possibility(int col) {
	    
	    for (int i=0 ; i<col ; i++) {
	        
	        if (arr[col] == arr[i]) {
	            return false;
	        }
	        
	        if (Math.abs(col-i) == Math.abs(arr[col] - arr[i])) {
	            return false;
	        }
	    }
	    return true;
	}
}