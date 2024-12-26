import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Set<String> set = new HashSet();
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		int sycle=0;
		
		while(sycle<sb.length()){
		    for(int i=0 ; i<sb.length() ; i++){
		        if(i+sycle < sb.length()){ 
		            set.add(sb.substring(i,i + sycle+1));
		        }
		    }
		    sycle++;
		}
	
	    bw.write(String.valueOf(set.size()));

		bw.close();
		br.close();
	}
}
