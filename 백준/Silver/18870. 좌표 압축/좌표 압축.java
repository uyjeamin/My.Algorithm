/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int[] vertex = new int[n];
	    int[] sortedVer = new int[n];
	    int[] result = new int[n];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    for(int i=0 ; i<n ; i++){
	        vertex[i] = Integer.parseInt(st.nextToken());
	    //    bw.write(vertex[i]+" ");
	        
	    }
	    
	    sortedVer = Arrays.stream(vertex).distinct().sorted().toArray();
	    
	   
	    Map<Integer,Integer> map = new HashMap<>();
	    
	    for(int i=0 ; i<sortedVer.length ; i++){
	        map.put(sortedVer[i],i);
	    }
	    
	    for(int i=0 ; i<n ; i++){
	        bw.write(map.get(vertex[i])+" ");
	    }
	    
	    
	    bw.close();
	    br.close();
	    
	}
}
