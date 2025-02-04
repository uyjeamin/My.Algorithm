import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long mLCM; 
		int[] n = new int[2];
		int[] m = new int[2];
		int resultN = 0;
		
		
		
		
		for(int i=0 ; i<2 ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
	    	n[i] = Integer.parseInt(st.nextToken());
	    	m[i] = Integer.parseInt(st.nextToken());
		}
		
		
		    long GCD = EuclideanAlgorithmGCD(m[0],m[1]);
		
		    mLCM = m[0]*m[1]/GCD;
		    
		for(int i=0 ; i<2 ; i++){
	            n[i]*= mLCM/m[i];
	            resultN += n[i];
	    }
	        long resultGCD = EuclideanAlgorithmGCD(resultN,mLCM);
	        
	        bw.write(resultN/resultGCD+" "+mLCM/resultGCD);
	        bw.close();
		    br.close();
		}
		
		//최대 공약수(GCD) 구하는 함수수
	public static long EuclideanAlgorithmGCD(long a,long b){
	    long temp = a%b;
	    
	    if(temp == 0){
	        return b;
	    }else{
	        return EuclideanAlgorithmGCD(b,temp);
	    }
	}
	}
	
	