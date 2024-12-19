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
	    
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    String[] S = new String[n];
	    String[] check = new String[m];
	    int count = 0;
	    
	    
	    for(int i=0 ; i<n ; i++){
	        S[i] = br.readLine(); 
	    }
	    
	    for(int i=0 ; i<m ; i++){
	        check[i] = br.readLine();
	    }
	    
	    Map<String,Integer> map = new HashMap<>();
	    
	    for(int i=0 ; i<n ; i++){
	        map.put(S[i],1);
	    }
	    
	    for(int i=0 ; i<m ; i++){
	        if(map.containsKey(check[i])){
	            count++;
	        }
	    }
	    
	    // int 타입 출력못함 String 타입만 받을수 있음.
	    bw.write(String.valueOf(count)); 
	    
	    bw.flush();
	    bw.close();
	    br.close();
	    
	}
}
