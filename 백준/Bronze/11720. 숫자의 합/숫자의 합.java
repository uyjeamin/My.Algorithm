import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		String m = br.readLine();
		
		int result=0;
		for(int i=0 ; i<n ; i++){
		    result += m.charAt(i) - '0';
		}
		bw.write(result+"");
		
		bw.close();
		br.close();
	}
}
