import java.io.*;
import java.util.*;

public class Main
{
	static int[][] gragh;
	static boolean[][] isVisited;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int n;
	static int m;



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		gragh = new int[n][m];
		isVisited = new boolean[n][m];

		for (int i=0 ; i<n ; i++) {
			String input = br.readLine();

			for (int j=0 ; j<m ; j++) {
				gragh[i][j] = input.charAt(j) -'0';
			}
		}

		bfs(0,0);
		
		bw.write(gragh[n-1][m-1]+"");

		bw.close();
		br.close();
	}

	static void bfs(int y, int x) {
		Queue<int[]> queue = new LinkedList();
		isVisited[y][x] = true;
		queue.add(new int[] {y, x});

		while (!queue.isEmpty()) {
			int cy = queue.peek()[0];
			int cx = queue.peek()[1];

			queue.poll();

			for (int i=0 ; i<4 ; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];

				if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
					if (gragh[ny][nx] == 1 && !isVisited[ny][nx]) {
						isVisited[ny][nx] = true;
                        // 여태까지 거쳐온 정점 수 +1
						gragh[ny][nx] += gragh[cy][cx];

						queue.add(new int[] {ny, nx});
					}
				}
			}
		}
	}
}
