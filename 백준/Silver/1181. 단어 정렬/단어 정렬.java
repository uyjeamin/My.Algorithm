/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] strArr = new String[n];
		
		for(int i=0 ; i<n ; i++){
		    //StringTokenizer st = new StringTokenizer(br.readLine());
		    strArr[i] = br.readLine();
		}
		
		strArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
		
		Arrays.sort(strArr, new Comparator<String>(){
		    
		    @Override
		    public int compare(String o1,String o2){
		        return o1.length()!=o2.length() ? o1.length()-o2.length(): o1.compareTo(o2); 
		    }                                                           // 문자열 비교, 앞이 사전순으로 더 크면 음수, 크면 양수,같으면 0
		    
		});
		
		for(String str : strArr){
		    bw.write(str+"\n");
		}
		bw.close();
		br.close();
		
	}
}
