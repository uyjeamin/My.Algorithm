import java.io.*;
import java.util.*;

public class Main
{
    
    static ArrayList<ArrayList<Integer>> gragh = new ArrayList();
    static int count = 1;
    static int[] check;
    
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int r = 1;
		
		check = new int[n+1];
		
		for (int i=0 ; i<=n ; i++) {
		    gragh.add(new ArrayList());
		}
		
		for (int i=0 ; i<m ; i++) {
		    StringTokenizer st1 = new StringTokenizer(br.readLine());
		    int ver1 = Integer.parseInt(st1.nextToken());
		    int ver2 = Integer.parseInt(st1.nextToken());
		    
		    gragh.get(ver1).add(ver2);
		    gragh.get(ver2).add(ver1);
		}
		
		for (int i=0 ; i<=n ; i++) {
		    //Collections.sort(gragh.get(i), Collections.reverseOrder());
		    Collections.sort(gragh.get(i), new Comparator<Integer>(){
		        @Override
		        public int compare(Integer o1, Integer o2) {
		            return o2-o1;
		        }
		    });
		}
		
		/*for (int i=0 ; i<n ; i++) {
		    for (int j=0 ; j<gragh.get(i).size() ; j++) {
		       System.out.print(gragh.get(i).get(j)+" ");
		    }
		    System.out.println();
 		}*/
 		
 		dfs(r);
 		
 		int virusComputerCnt = 0;
 		
 		for (int i=1 ; i<=n ; i++) {
 		    
 		    //System.out.println(check[i]);
 		    
 		    if (!(check[i] == 0)) {
 		        virusComputerCnt++;
     		 }
 		}
 		
 		 		
 		System.out.println(virusComputerCnt-1);
        
		bw.close();
		br.close();
	}
	
	public static void dfs(int r) {
	    check[r] = count++;
	    
	    for (int i=0 ; i<gragh.get(r).size() ; i++) {
	        int nextVertex = gragh.get(r).get(i);
	        if (check[nextVertex] == 0) {
	            dfs(nextVertex);
	        }
	    }
	}
}
