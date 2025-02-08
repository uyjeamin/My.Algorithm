import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
		    long num = Long.parseLong(br.readLine());
		    long decimal;
		    
		   
		    
		    while(true){
		        decimal = findDecimal(num);
		        if(decimal != -1){
		            bw.write(decimal + "\n");
		            break;
		        }else{
		            num++;  // 소수가 아니면 num을 증가시켜서 다시 시도
		        }
		    }
		}
		
		bw.close();
		br.close();
	}

    public static long findDecimal(long n){
        if (n == 2 || n == 3) {
            return n;  // 2와 3은 바로 반환
        }
        
        if (n <= 1) {
            return -1;  // 1은 소수가 아님
        }
        
        int su = (int)Math.sqrt(n);
        for(int i = 2; i <= su; i++){
            if(n % i == 0){
                return -1;  // 나누어 떨어지면 소수가 아니므로 -1 반환
            }
        }
        return n;  // 소수라면 그 자체를 반환
    }
}
