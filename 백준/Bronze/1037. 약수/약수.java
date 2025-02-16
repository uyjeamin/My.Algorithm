import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] divisor = new int[n];
		
		int max=0;
		int min= 1000001;
		boolean isEvenNum = false;
		
		for(int i=0 ; i<n ; i++){
		    int input = Integer.parseInt(st.nextToken());
		    if(input<min){
		        min = input; 
		    }
		    if(input>max){
		        max = input;
		    }
		}
		
		bw.write(max*min+"");
		
    
		bw.close();
		br.close();
	}
}
