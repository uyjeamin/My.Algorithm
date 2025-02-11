import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
    	String str = br.readLine();
	    int[] result = new int[26];
	    
	    for(int i=0 ; i<26 ; i++){
	        int ASCII = 97+i;
	        char alphabet = (char) ASCII;
	        bw.write(str.indexOf(alphabet)+" ");
	    }
	  
		bw.close();
		br.close();
	}
}
