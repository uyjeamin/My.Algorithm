/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	   // Scanner sc = new Scanner(System.in);
	    
	   // int n = sc.nextInt();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int[] arr = new int[n];
	    
	    for(int i=0 ; i<n ; i++){
	     
	       arr[i] = Integer.parseInt(br.readLine());
	    }
	    
	    Arrays.sort(arr);
	    
	    for(int i=0 ; i<n ; i++){
	        bw.write(arr[i]+"\n");
	    }
        bw.flush();
        bw.close();
        
       
	}
}