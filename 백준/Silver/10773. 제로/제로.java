import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Stack<Integer> stack = new Stack();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++){
		    int input = Integer.parseInt(br.readLine());
		    if(input == 0){
		        stack.pop();
		    }else{
		        stack.push(input);
		    }
		}
		
		    long sum = 0;
		    while(stack.size()>0){
		    sum += stack.pop();    
		    }
		    bw.write(sum+"");
		
		
    
		bw.close();
		br.close();
	}
}
