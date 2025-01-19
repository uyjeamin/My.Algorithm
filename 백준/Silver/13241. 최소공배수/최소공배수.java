import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
	
		    
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    long a = Integer.parseInt(st.nextToken());
		    long b = Integer.parseInt(st.nextToken());
		    
		    long GCD = EuclideanAlgorithmGCD(a,b);
		    
		    bw.write(String.valueOf(a*b/GCD+"\n"));
		    
		
    
		bw.close();
		br.close();
	}
	//Euclidean Algorithm 재귀호출
	public static long EuclideanAlgorithmGCD(long a,long b){
	    long temp = a%b;
	    
	    if(temp == 0){
	        return b;
	    }else{
	        return EuclideanAlgorithmGCD(b,temp);
	    }
	}
}
