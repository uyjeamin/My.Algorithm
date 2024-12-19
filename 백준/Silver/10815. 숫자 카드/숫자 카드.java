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
	    int[] own = new int[n];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    for(int i=0 ; i<n ; i++){
	        own[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    int m = Integer.parseInt(br.readLine());
	    int[] newArr = new int[m];
	    
	     StringTokenizer st1 = new StringTokenizer(br.readLine());
	    
	    for(int i=0 ; i<m ; i++){
	        newArr[i] = Integer.parseInt(st1.nextToken());
	    }
	    Map<Integer,Integer> map = new HashMap<>();
	    
	    for(int i=0 ; i<n ;i++){
	        map.put(own[i],1);
	    }
	    
	    for(int i=0 ; i<m ; i++){
	        if(map.containsKey(newArr[i])){ //매게변수에 맞는 키기 있으면 true 없으면 false
	            bw.write(1+" ");
	        }else{
	            bw.write(0+" ");
	        }
	    }
	    
	    bw.close();
	    br.close();
	    
	}
}
