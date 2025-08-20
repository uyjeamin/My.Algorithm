import java.util.*;
import java.io.*;

public class Main
{
    static int n;
    static int[][] map = new int[25][25];
    static boolean[][] isVisited = new boolean[25][25];
    static int[] aparts = new int[625]; 
    static int apartNum = 0; //아파트 단지
    
    // 상하좌우 이동
    static int[] dx = {1,-1,0,0}; 
    static int[] dy = {0,0,1,-1};
    
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    n = Integer.parseInt(br.readLine());
	    
	    //입력
	    for (int i=0 ; i<n ; i++) {
	        String input = br.readLine();
	        for (int j=0 ; j<n ; j++) {
	            map[i][j] = input.charAt(j) - '0';
	        }
	    }
	    
	    // 가장 처음 dfs 에 넣을 1 찾기.
	    for (int i=0 ; i<n ; i++) {
	        for (int j=0 ; j<n ; j++) {
	            if (map[i][j] == 1 && !isVisited[i][j]) {
	                
	                //인접한 모든 아파트 dfs 로 모두 방문.
	                bfs(i,j);
	                // 하나의 단지 끝, 다음 단지 
	                apartNum++;
	            }
	        }
	    }
	    
	    Arrays.sort(aparts);
	    
	   bw.write(String.valueOf(apartNum)+"\n");
	    
	    for(int i=0 ; i<aparts.length ; i++) {
	        if (aparts[i] == 0) {
	            
	        } else {
	           bw.write(String.valueOf(aparts[i])+"\n");   
	        }
	    }

	    br.close();
	    bw.close();
	}
	
	// 상하좌우 dfs 탐색
	static void bfs (int x, int y) {
	    Queue<int[]> queue = new LinkedList();
	    isVisited[x][y] = true;
	    aparts[apartNum]++;
	    
	    queue.add(new int[]{x, y});
	    
	    while (!queue.isEmpty()) {
	        int cx = queue.peek()[0];
	        int cy = queue.peek()[1];
	        
	        
	        queue.poll();
	        
	        for (int i=0 ; i<4 ; i++) {
	            int nx = cx + dx[i];
	            int ny = cy + dy[i];
	            
	            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {                
	                if (!isVisited[nx][ny] && map[nx][ny] == 1) {
	                    //System.out.println(map[nx][ny]);
    	                //System.out.println(nx+" "+ny);
	                    isVisited[nx][ny] = true;
	                    aparts[apartNum]++;
	                    queue.add(new int[]{nx, ny});
	                    
	                }
	            } 
	        }
	    }
	}
}
