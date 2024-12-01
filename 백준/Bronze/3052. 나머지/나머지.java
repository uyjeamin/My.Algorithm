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
		
		int[] arr1 = new int[10];
		for(int i=0 ; i<10 ; i++){
	      arr1[i] = sc.nextInt()%42;
		}
		
		arr1 = Arrays.stream(arr1).distinct().toArray();
		
		System.out.print(arr1.length);
		
		
		
	}
}
