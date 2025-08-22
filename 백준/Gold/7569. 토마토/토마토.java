import java.io.*;
import java.util.*;

public class Main
{
	static int[][][] gragh;
	static int[] dx = {1, -1, 0, 0, 0, 0};
	static int[] dy = {0, 0, 1, -1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	static int n;
	static int m;
	static int h;
	static boolean isAllMellowed = true;
	static int result;

	static Queue<int[]> queue = new LinkedList();



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		gragh = new int[h][n][m];

		for (int i=0 ; i<h ; i++) {
			for (int j=0 ; j<n ; j++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				for (int k=0 ; k<m ; k++) {
					gragh[i][j][k] = Integer.parseInt(st1.nextToken());
				}
			}
		}

		for (int i=0 ; i<h ; i++) {
			for (int j=0 ; j<n ; j++) {
				for (int k=0 ; k<m ; k++) {
					if (gragh[i][j][k] == 1) {
						queue.add(new int[] {i,j,k});
					}
				}
			}
		}

		bfs();

		if (isAllMellowed) {
			result = 0;
		}

		int max = 0;


		for (int i=0 ; i<h ; i++) {
			for (int j=0 ; j<n ; j++) {
				for (int k=0 ; k<m ; k++) {
					if (gragh[i][j][k] == 0) {
						bw.write(String.valueOf(-1));
						bw.close();
						br.close();
						return;
					}

					if (gragh[i][j][k] > max) {
						max = gragh[i][j][k];
					}
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
			int cz = queue.peek()[0];
			int cy = queue.peek()[1];
			int cx = queue.peek()[2];
			queue.poll();


			for (int i=0 ; i<6 ; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				int nz = cz + dz[i];

				if (nx >= 0 && ny >= 0 && nz >= 0 && nx < m && ny < n && nz < h) {
					if (gragh[nz][ny][nx] == 0) {
						isAllMellowed = false;
						gragh[nz][ny][nx] = gragh[cz][cy][cx]+1;
						queue.add(new int[] {nz,ny, nx});
					}
				}
			}
		}
	}
}
