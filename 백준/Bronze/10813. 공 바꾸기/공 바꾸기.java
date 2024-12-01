/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n]; // 바구니번호 = 인덱스 번호+1
		
		for(int i=0 ; i<n ; i++){
		    arr[i] = i+1;
		}
		
	    for(int k=0 ; k<m ; k++){
	        int i,j,temp;
	        i = sc.nextInt();
	        j = sc.nextInt();
	        
	        temp = arr[i-1];
	        arr[i-1] = arr[j-1];
	        arr[j-1] = temp;
	        
	    }
	    
	    for(int i=0 ; i<n ; i++){
	        System.out.print(arr[i]+" ");
	    }
		
		
		
		
	}
}