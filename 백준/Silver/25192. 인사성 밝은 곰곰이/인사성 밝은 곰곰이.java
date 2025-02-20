import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		

        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        int result = 0;
        
        br.readLine();
        for(int i=1 ; i<n ; i++){
            String input = br.readLine();
            
            if (input.equals("ENTER")) {
                result += set.size();
                set.clear();
            } else {
            set.add(input);
            }
        }
        result += set.size();
        
        bw.write(result+"");

		bw.close();
		br.close();
	}
}
