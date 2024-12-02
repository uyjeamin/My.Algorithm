/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int aver,median;
        int[] arr = new int[5];
        
        for(int i=0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
        }
        
        
        aver = (int)Arrays.stream(arr).average().getAsDouble();
        Arrays.sort(arr);
        
        median = arr[2];
        
        
        System.out.println(aver);
        
        System.out.println(median);
       
	}
}