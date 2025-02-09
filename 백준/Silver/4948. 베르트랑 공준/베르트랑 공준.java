import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true){
		    int count=0;
		    int n = Integer.parseInt(br.readLine());
		    
		    if(n==0) break;
		    
		    long deci = 0;
		    for(int i=n+1 ; i<= 2*n ; i++){
		    deci = decimal(i);
		    if(deci!=-1){
		        count++;
		    }
		    
		}
		bw.write(count+"\n");
	}
		bw.close();
		br.close();
	}
	
	public static long decimal(long x){
	    int su = (int)Math.sqrt(x);
	    
	    if(x==2 || x==3){
	        return x;
	    }else if(x==1){
	        return -1;
	    }
	    
	    for(int i=2 ; i<=su ; i++){
	        if(x%i==0){
	            return -1;
	        }
	    }
	    return x;
	}

}
