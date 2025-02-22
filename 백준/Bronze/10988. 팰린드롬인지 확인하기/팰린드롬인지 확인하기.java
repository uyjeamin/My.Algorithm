import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
        String input = br.readLine();
        int result = 1;
        
        for(int i=0 ; i<input.length() ; i++){
            
            if (!(input.charAt(i) == input.charAt(input.length()-1-i)))
            result = 0;
        }
		
		bw.write(result+"");
    
		bw.close();
		br.close();
	}
}
