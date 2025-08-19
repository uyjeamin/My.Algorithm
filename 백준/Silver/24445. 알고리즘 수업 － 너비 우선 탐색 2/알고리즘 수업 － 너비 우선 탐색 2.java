import java.io.*;
import java.util.*;

public class Main
{
    static ArrayList<ArrayList<Integer>> gragh = new ArrayList();
    static int[] check;
    static int count = 1;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		check = new int[n+1];
		
		for(int i=0 ; i<=n ; i++) {
		    gragh.add(new ArrayList<>());
		}
		
		for (int i=0 ; i<m ; i++) {
		    StringTokenizer st1 = new StringTokenizer(br.readLine());
		    int ver1 = Integer.parseInt(st1.nextToken());
		    int ver2 = Integer.parseInt(st1.nextToken());
		    
		    gragh.get(ver1).add(ver2);
		    gragh.get(ver2).add(ver1);
		}
		
        for (int i=0 ; i<=n ; i++) {
 		    /*
 		    Collections.sort(gragh.get(i), new Comparator<Integer>() {
 		        @Override
 		        public int compare(Integer o1, Integer o2) {
 		            return o2 - o1;
 		        }
 		    });*/
 		    
 		    Collections.sort(gragh.get(i), Collections.reverseOrder());
 		}
 		
		bfs(r);
		
		for (int i=1 ; i<=n ; i++) {
		    bw.write(check[i]+"\n");
		}

		bw.close();
		br.close();
	}
	
	static void bfs(int r) {
	    Queue<Integer> queue = new LinkedList<>();
	    
	    check[r] = count++;
	    queue.add(r);
	    
	    while (!queue.isEmpty()) {
	        int vertex = queue.poll();
	        
	        for (int i=0 ; i<gragh.get(vertex).size() ; i++) {
	            int nextVertex = gragh.get(vertex).get(i);
	            if (check[nextVertex] == 0) {
	                check[nextVertex] = count++;
	                queue.add(nextVertex);
	            }
	        }
	    }
	}
}
