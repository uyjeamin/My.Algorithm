import java.io.*;
import java.util.*;

public class Main
{
	static int[][][] graghs;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int m;
	static int n;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		graghs = new int[t][50][50];
		int[] earthWormNums = new int[t];

		for (int i=0 ; i<t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());


			for (int j=0 ; j<k ; j++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st1.nextToken());
				int y = Integer.parseInt(st1.nextToken());

				graghs[i][y][x] = 1;
			}


			for (int j=0 ; j<n ; j++) {
				for (int l=0 ; l<m ; l++) {
					if (graghs[i][j][l] == 1) {
						dfs(l, j, i);
						earthWormNums[i]++;
					}
				}
			}
		}


		for (int i=0 ; i<t ; i++) {
			bw.write(String.valueOf(earthWormNums[i])+"\n");
		}

		bw.close();
		br.close();
	}

	static void dfs(int cx, int cy, int testCase) {
		graghs[testCase][cy][cx] = 0;

		for (int i=0 ; i<4 ; i++) {
			int nx = cx + dx[i];
			int ny = cy + dy[i];

			if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
				if (graghs[testCase][ny][nx] == 1) {
					graghs[testCase][ny][nx] = 0;
					dfs(nx, ny, testCase);
				}
			}
		}
	}
}
