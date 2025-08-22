import java.io.*;
import java.util.*;

public class Main
{
	static int[][][] maps;
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {2, 1, -1, -2, 2, 1, -1, -2};
	static int l;
	static int[] results;
	static int kx;
	static int ky;
    static int gx;
    static int gy;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		results = new int[t];
		maps = new int[t][300][300];

		for (int i=0 ; i<t ; i++) {
			l = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			kx = Integer.parseInt(st.nextToken());
			ky = Integer.parseInt(st.nextToken());
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			gx = Integer.parseInt(st1.nextToken());
			gy = Integer.parseInt(st1.nextToken());
			
			
			bfs(ky, kx, i);
		}


		for (int i=0 ; i<t ; i++) {
			bw.write(String.valueOf(results[i]-1)+"\n");
		}

		bw.close();
		br.close();
	}

	static void bfs(int y, int x, int testCase) {
	    maps[testCase][y][x] = 1;
	    
		Queue<int[]> queue = new LinkedList();
		queue.add(new int[] {y, x});

		while (!queue.isEmpty()) {
		    
		    int cy = queue.peek()[0];
			int cx = queue.peek()[1];
			queue.poll();
			
			if (cx == gx && cy == gy) {
			    results[testCase] = maps[testCase][gy][gx];
			}

			for (int i=0 ; i<8 ; i++) {
				int ny = cy + dy[i];
				int nx = cx + dx[i];

				if (nx >= 0 && ny >= 0 && nx < l && ny < l) {
					if (maps[testCase][ny][nx] == 0) {
						maps[testCase][ny][nx] = maps[testCase][cy][cx]+1;
						queue.add(new int[] {ny, nx});
					}
				}
			}
		}
	}
}
