import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		
		HashSet<Integer> colonnadeSet = new HashSet<>();
		int first = Integer.parseInt(br.readLine());
		int prev = first;
		colonnadeSet.add(first);
		
		int minOfGCDs=0;
		int last;
	
		for(int i=1,temp = 0; i<n ; i++){
		    int curr = Integer.parseInt(br.readLine());
		    colonnadeSet.add(curr);
		    
		   if(i == 1){
		    temp = curr - prev;
		   }else{
		       minOfGCDs = getGCD(temp,curr - prev);
		       
		       if(temp > minOfGCDs){
		          temp = minOfGCDs;
		        }
		   }
		   prev = curr;
		    
		}
		
		bw.write(((prev-first)/minOfGCDs+1)-n+"");
		
    
		bw.close();
		br.close();
	}
	
	public static int getGCD(int a, int b){
	    int c;
	    while(b != 0)
	    {
	        c = a%b;
	        a = b;
	        b = c;
	    }
	    return a;
	}
}
