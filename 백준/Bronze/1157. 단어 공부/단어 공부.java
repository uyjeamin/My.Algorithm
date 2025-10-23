import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		int ASCLL_A = 65;
		
		int result[] = new int[26];
		
		for (int i=0 ; i<input.length(); i++) {
		    char charInput = input.charAt(i);
		    
		    if (90 < charInput) {
		        result[charInput-(32+65)]++;
		    } else {
                result[charInput-65]++;
		        
		    }

		}
		
		int max = -1;
		int resultN = 0;
		boolean flag = false;
		for (int i=0 ; i<26; i++) {
		    if (result[i] > max) {
		        max = result[i];
		        resultN = i;
		        flag = false;
		    } else if(result[i] == max) {
		        flag = true;
		    }
		}
		
		if (!flag) {
		    bw.write(((char)(resultN+65))+"");
		} else {
		    bw.write("?");
		}
		
	
		bw.close();
		br.close();
	}
}
