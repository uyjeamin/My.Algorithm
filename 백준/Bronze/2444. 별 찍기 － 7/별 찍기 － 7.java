import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n ; i>0 ; i--){
		    for(int j=i-1 ; j>0 ; j--){
		        bw.write(" ");
		    }
		    for(int j=0 ; j<=n-i ; j++){
		        bw.write("*");
		    }
		    for(int j=0 ; j<n-i ; j++){
		        bw.write("*");
		    }
		    
		    bw.write("\n");
		}
		
		for(int i=n-1 ; i>0 ; i--){
		    
		    for(int j=0 ; j<n-i ; j++){
		        bw.write(" ");
		    }
		    for(int j=i-1 ; j>=0 ; j--){
		        bw.write("*");
		    }
		    for(int j=i-1 ; j>0 ; j--){
		        bw.write("*");
		    }
		    
		    bw.write("\n");
		}

    
		bw.close();
		br.close();
	}
}
