import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++){
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
		
		    long n = (long)Integer.parseInt(st.nextToken());
		    long m = (long)Integer.parseInt(st.nextToken());
		    
		    // m 에서 n 개를를 뽑는 경우의 수 조합론에선 순서를 상관하지 않기 때문에
		    // {1,3} 과 {3,1} 를 상관하지 않기 때문에 하나의 경우에 수로 침
		    // -> 교차하는 경우는 자동으로 제외됨. 
		    bw.write(binomialCoefficient(m,n)+"\n");
		
		}
		
    
		bw.close();
		br.close();
	}

		
    
    public static long binomialCoefficient(long n,long k){
        // return factorial(n)/(factorial(k)*factorial(n-k)); 그냥 이항계수 공식은 long 자료형을 넘어서
        //오버플로우남
        
        if(k > n - k){ //이항계수의 대칭성을 활용한 최적화
            k = n-k; // (n k) 와 (n n-k) 의 이항계수 결과값이 같다.
        }
        
        long result = 1;
        
        for(int i=0 ; i<k ; i++){
            result = result * (n-i)/(i+1); // 이항계수 공식 변형.
        }
        
        return result;
        
    }
    
/*	
	public static long factorial(long num){
	    if(num == 1 || num == 0){
	        return 1;
	    }
	    
	    return num * factorial(num-1);
	}
	*/
}


