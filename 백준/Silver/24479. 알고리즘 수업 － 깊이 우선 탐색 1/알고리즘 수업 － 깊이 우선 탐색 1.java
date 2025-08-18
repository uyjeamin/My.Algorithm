import java.io.*;
import java.util.*;

public class Main
{
	static int count = 1;
    static ArrayList<ArrayList<Integer>> gragh = new ArrayList<>();
    static int[] check;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st1 = new StringTokenizer(br.readLine());


		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		int startVer = Integer.parseInt(st1.nextToken());


		for (int i=0 ; i<=n ; i++) {
			gragh.add(new ArrayList<>());
		}

		check = new int[n+1];

		for (int i=0 ; i<m ; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());

			int ver1 = Integer.parseInt(st2.nextToken());
			int ver2 = Integer.parseInt(st2.nextToken());

			gragh.get(ver1).add(ver2);
			gragh.get(ver2).add(ver1);
		}

		for (int i=0 ; i<n ; i++) {
			Collections.sort(gragh.get(i));
		}
		
		DFS(startVer);
		
		for(int i=1 ; i<=n ; i++) {
		    bw.write(check[i]+"\n");
		}
		
		bw.close();
		br.close();
	}

	public static void DFS(int vertex) {
	    check[vertex] = count++;
	    
		for (int i=0 ; i<gragh.get(vertex).size() ; i++) {
			int nextVertex = gragh.get(vertex).get(i); 
			
			if (check[nextVertex] == 0) {
			    
				DFS(nextVertex);
			}
		}
	}
}
