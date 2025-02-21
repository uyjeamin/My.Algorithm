import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		
		set.add("ChongChong");
		
		for(int i=0 ; i<t ; i++){
		    
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    String input1 = st.nextToken();
		    String input2 = st.nextToken();
		    
		    if(set.contains(input1)){
		        set.add(input2);
		    }else if(set.contains(input2)){
		        set.add(input1);
		    }
		}
		
		bw.write(set.size()+"");
		
		bw.close();
		br.close();
	}
}
