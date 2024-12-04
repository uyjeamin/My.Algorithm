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
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] strArr = new String[n][2];
		
		for(int i=0 ; i<n ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    strArr[i][0] = st.nextToken();
		    strArr[i][1] = st.nextToken();
		}
		
		Arrays.sort(strArr,new Comparator<>(){
		    
		    @Override
		    public int compare(String[] o1,String[] o2){
		        return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
		        
		        
		    }
		    
		});
		
		for(String[] row : strArr){
		    for(String column : row){
		        bw.write(column+" ");
		    }
		    bw.write("\n");
		}
		bw.close();
		br.close();
		
		
	}
}
