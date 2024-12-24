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
		
		int count;
		List<String> result = new ArrayList();
		
		Map<String,String> neverHeard = new HashMap();
		
		for(int i=0 ; i<n ; i++){
		    neverHeard.put(br.readLine(),"EMPTY");
		}
		
		for(int i=0 ; i<m ; i++){
		    String input = br.readLine();
		    if(neverHeard.containsKey(input)){
		        result.add(input);
		    }
		 }
		 //오름차순 정렬 내림차순은 Comparator.reverseOrder()
		result.sort(Comparator.naturalOrder());
		
		//출력력
		bw.write(result.size()+"\n");
		for(int i=0 ; i<result.size() ; i++){
		    bw.write(result.get(i)+"\n");
		}
	
		bw.close();
		br.close();
	}
}
