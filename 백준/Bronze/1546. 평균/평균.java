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
		int n = sc.nextInt();
		int max = 0;
		int[] score = new int[n]; 
		double[] newscore = new double[n];
		
		for(int i=0 ; i<n ; i++){
		    score[i] = sc.nextInt();
		    if(max < score[i]){
		        max = score[i];
		    }
		}
		
		for(int i=0 ; i<n ; i++){
		    newscore[i] = (double)score[i]/max*100;
		}
		
		double result = Arrays.stream(newscore).sum()/n;
		System.out.print(result);
	}
}
