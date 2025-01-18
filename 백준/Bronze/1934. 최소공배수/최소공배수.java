import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++){
		    
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    int GCD = EuclideanAlgorithmGCD(a,b);
		    
		    bw.write(String.valueOf(a*b/GCD+"\n"));
		    
		}
	
		
		
    
		bw.close();
		br.close();
	}
	//Euclidean Algorithm 재귀호출출
	public static int EuclideanAlgorithmGCD(int a,int b){
	    int temp = a%b;
	    
	    if(temp == 0){
	        return b;
	    }else{
	        return EuclideanAlgorithmGCD(b,temp);
	    }
	}
}
