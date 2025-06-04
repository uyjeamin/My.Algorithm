import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int[][] adj = new int[N+1][N+1];
		
		for(int i=0 ; i<M ; i++){
		    StringTokenizer st1 = new StringTokenizer(br.readLine());
		    int I = Integer.parseInt(st1.nextToken());
		    int J = Integer.parseInt(st1.nextToken());
		    
		    adj[I][J] = 1;
		    adj[J][I] = 1;
		}
		
		String dfsResult = DFS(adj,V);
		String bfsResult = BFS(adj,V);
		
		bw.write(dfsResult+"\n");
		bw.write(bfsResult);
		
		bw.close();
		br.close();
	}
	
	public static String DFS(int[][] adjMat, int startV) {
	    StringBuilder sb = new StringBuilder();
	    
	    Stack<Integer> stack = new Stack<Integer>();
	    boolean[] isVisited = new boolean[adjMat.length];
	    
	    stack.push(startV);
	    
	    while(!stack.isEmpty()) {
	        
	        int vertex = stack.pop();
	        
	    if(isVisited[vertex] == false){
	        isVisited[vertex] = true;
	        sb.append(vertex+" ");
	        
	        for(int i=adjMat.length-1; i>=0 ; i--) {
	       
	            if(adjMat[vertex][i] == 1 && !isVisited[i]) {
	                stack.push(i);
	            }
	        }
	      }
	    }
	    
	    return sb.toString();
	}
	
	public static String BFS(int[][] adjMat, int startV) {
	    StringBuilder sb = new StringBuilder();
	    
	    int n = adjMat.length;
	    Queue<Integer> queue = new LinkedList<Integer>();
	    boolean[] isVisited = new boolean[n];
	    
	    queue.add(startV);
	    isVisited[startV] = true;
	    
	    while (!queue.isEmpty()) {
	        int vertex = queue.poll();
	        sb.append(vertex+" ");
	        
	        for (int i=1 ; i<n ; i++){
	            if (adjMat[vertex][i] == 1 && !isVisited[i]) {
	                queue.add(i);
	                isVisited[i] = true;
	            } 
	        }
	    }
	    
	    return sb.toString();
	}
}
