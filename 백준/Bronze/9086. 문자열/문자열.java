import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++){
		    String st = br.readLine();
		   
		    bw.write(st.charAt(0)+""+st.charAt(st.length()-1)+"\n");
		}
		
		
    
		bw.close();
		br.close();
	}
}
