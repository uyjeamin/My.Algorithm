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
		
    	Map<String,String> map = new HashMap();
    	
		for(int i=0 ; i<n ; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    map.put(st.nextToken(),st.nextToken());
		}
		// key와 value 를 동시에 저장하는 entry로 변환
		List<Map.Entry<String,String>> entryList = new ArrayList<>(map.entrySet());
		
		// 역순으로 정렬렬
		entryList.sort((e1,e2)->e2.getKey().compareTo(e1.getKey()));
		
		
		for(Map.Entry<String,String> entry: entryList) {
		    if(entry.getValue().equals("enter")){
		        bw.write(entry.getKey()+"\n");
		    }
		}
		
			bw.close();
	        br.close(); 
	
	}
}
