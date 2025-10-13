import java.io.*;
import java.util.*;

public class Main
{
    
    static int[] arr;
    static boolean[] IsVisited;
    static int n,m;
    static BufferedReader br;
    static BufferedWriter bw;
    
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
	    arr = new int[m];
	    IsVisited = new boolean[n+1];
	    
	    dfsBacktracking(0);
		
	
		bw.close();
		br.close();
	}
	
	static public void dfsBacktracking(int depth) throws IOException {
	    
	    if (depth == m) {
	        for(int i=0 ; i<m ; i++) {
	            bw.write(arr[i]+" ");
	        }
	        bw.write("\n");
	        return ;
	    }
	    for (int i=1; i<=n; i++) {
	        if (!IsVisited[i]) { 
	            for (int j=1 ; j<i ; j++) {
	                IsVisited[j] = true;
	            }
	            
	            arr[depth] = i;
	            dfsBacktracking(depth+1); 
	            
	            for (int j=1 ; j<i ; j++) {
	                IsVisited[j] = false;
	            }
	        }
	    }
	}
}
