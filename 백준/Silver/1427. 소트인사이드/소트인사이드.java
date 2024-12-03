/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	   // Scanner sc = new Scanner(System.in);
	    
	   // int n = sc.nextInt();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    int[] arr = Stream.of(String.valueOf(num).split(""))
	                    .mapToInt(Integer::parseInt)
	                    .toArray();
	          
	    Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	          
	   Arrays.sort(arr2, Collections.reverseOrder());
	                    
	   for(int i : arr2){
	       System.out.print(i);
	   }
	   
	}
}