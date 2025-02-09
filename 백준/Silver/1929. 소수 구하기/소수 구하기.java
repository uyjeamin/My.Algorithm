import java.io.*;
import java.util.*;

public class Main
{
    static boolean[] isPrime;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        isPrimeFun(1000000);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i=n ; i<=m ; i++){
            if(!isPrime[i]){
                bw.write(i+"\n");
            }
        }
        
	
		bw.close();
		br.close();
	}
	
	
	
	public static void isPrimeFun(int n){
	    //소수가 false 인덱스번호가 숫자번호로 
	   isPrime = new boolean[n+1];
	   isPrime[0] = true;
	   isPrime[1] = true;  
	   
	   for(int i=2 ; i*i<=n ; i++){
	       if(!isPrime[i]){
	           for(int j=i*i ; j<=n ; j+=i){
	               isPrime[j] = true;
	           }
	       }
	   }
	}

}