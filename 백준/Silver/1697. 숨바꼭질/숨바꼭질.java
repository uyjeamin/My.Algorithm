import java.io.*;
import java.util.*;

public class Main
{
	static int[] map;
	static int[] dn = {1, -1, 2};
	static int N;
	static int K;
	static int minute = 0;
	static int size;



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		size = 100001;

        map = new int[size];

		bfs(N);

		bw.write(map[K]+"");

		bw.close();
		br.close();
	}

	static void bfs(int n) {
		Queue<Integer> queue = new LinkedList();
		queue.add(n);

		while (!queue.isEmpty()) {
			int cn = queue.poll();

			if (cn == K) {
				return;
			}

			for (int i=0 ; i<3 ; i++) {
				int pn;

				if (i == 2) {
					pn = cn * dn[i];
				} else {
					pn = cn + dn[i];
				}


				if (pn >= 0 && pn < size) {
					if (map[pn] == 0 && pn != N) {
						map[pn] = map[cn] + 1;
						
						queue.add(pn);
					}
				}
			}
		}
	}
}
