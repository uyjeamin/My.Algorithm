/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] ReverseTemp = new int[n];
		int[] basket = new int[n];
		
		for(int i=0 ; i<n ; i++){
		    basket[i] = i+1;
		    }
		
		for(int k=0 ; k<m ; k++){
		    int i,j;
		    i=sc.nextInt();
		    j=sc.nextInt();
		    
		    ReverseTemp = basket.clone();
            
		    for(int a=j-1,b=i-1 ;a>=i-1 ;a--,b++){
		        ReverseTemp[b] = basket[a];
		    }
		    
		    basket = ReverseTemp.clone();
		    
		    
		   	}
		for(int i=0 ; i<n ; i++){
		     System.out.print(basket[i]+" ");
	
		}
	}
}