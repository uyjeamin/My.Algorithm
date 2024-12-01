/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index=0;
		int[] result = new int[2];
		int[] arr = new int[30];
		
		for(int i=0 ; i<30 ; i++){
		    arr[i] = i+1;
		}
		
		
		for(int i=0 ; i<28 ; i++){
		    int num;
		    num = sc.nextInt();
		    arr[num-1] = 0;
		}
		

	    for(int i=0 ; i<30 ; i++){
	     if(arr[i] != 0){
	          result[index] = arr[i];
	                index = 1;
	     }   
	    }
	    
	    if(result[0]>result[1]){
	        System.out.println(result[1]);
	        System.out.println(result[0]);
	    }else{
	        System.out.println(result[0]);
	        System.out.println(result[1]);
	    }   
	  
	    
	    
		
		
	}
}
