import java.io.*;
import java.util.*;

public class Main
{
	static int[][] gragh;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int n;
	static int m;
	static boolean isAllMellowed = true;
	static int result;
	static Queue<int[]> queue = new LinkedList();



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		gragh = new int[n][m];

		for (int i=0 ; i<n ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());

			for (int j=0 ; j<m ; j++) {
				gragh[i][j] = Integer.parseInt(st1.nextToken());
			}
		}


		for (int i=0; i<n ; i++) {
			for (int j=0; j<m ; j++) {
				if (gragh[i][j] == 1) {
					queue.add(new int[]{i,j});
				}
			}
		}
		
		bfs();

		if (isAllMellowed) {
			result = 0;
		}

		int max = 0;

		for (int i=0; i<n ; i++) {
			for (int j=0; j<m ; j++) {
				if (gragh[i][j] == 0) {
					bw.write(String.valueOf(-1));
					bw.close();
					br.close();
					return;
				}

				if (gragh[i][j] > max) {
					max = gragh[i][j];
				}
			}
		}

		result = max-1;

		bw.write(result+"");

		bw.close();
		br.close();
	}

	static void bfs() {
		while (!queue.isEmpty()) {
			int cy = queue.peek()[0];
			int cx = queue.peek()[1];
			queue.poll();


			for (int i=0 ; i<4 ; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];

				if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
					if (gragh[ny][nx] == 0) {
						isAllMellowed = false;
						gragh[ny][nx] = gragh[cy][cx]+1;

						queue.add(new int[] {ny, nx});
					}
				}
			}
		}
	}
}
