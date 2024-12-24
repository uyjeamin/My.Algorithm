import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<n ; i++){
		    int num = Integer.parseInt(st.nextToken());
		    //getOrDefault : num 이라는 key 가 존재하면 get(num) 아니면 0
		    map.put(num,map.getOrDefault(num,0)+1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		int[] Becompared = new int[m];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<m ; i++){
		    int num = Integer.parseInt(st1.nextToken());
		    bw.write(map.getOrDefault(num,0)+" ");
		}
		
    
		bw.close();
		br.close();
	}
}
