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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		Map<String,String> KeyToValue = new HashMap();
		Map<String,String> ValueToKey = new HashMap();
		
		for(int i=1 ; i<=n ; i++){
		    String Pname = br.readLine();
		    KeyToValue.put(String.valueOf(i),Pname);
		    ValueToKey.put(Pname,String.valueOf(i));
		}
		
		
		for(int i=0 ; i<m ; i++){
		    String temp = br.readLine();
		    
		    if(KeyToValue.containsKey(temp)){
		        
		        bw.write(KeyToValue.get(temp)+"\n");
		        
		    }else{
		      /* String result = map.entrySet()
		              .stream() 
                      // temp 에 있는 값과 같은 값을 가진 스트림이 아니면 걸러냄
		              .filter(entry -> entry.getValue().equals(temp)) //사소한데 많이틀림 문자열비교 = equals()
		              // map 은 각 스트림을 변환을 거쳐 새로운 스트림을 생성한다.
		              .map(Map.Entry::getKey) // Map.Entry 의 getKey 메서드를 사용하겠다.
                      .findFirst()
                      .orElse("null");
    		            
		            bw.write(result+"\n"); */
		        bw.write(ValueToKey.get(temp)+"\n");
		    }
		}
    
		bw.close();
		br.close();
		
	}
}
