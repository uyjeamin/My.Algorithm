import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int n = Integer.parseInt(br.readLine()); // n을 먼저 읽기
        int[][] coordinate = new int[n][2];
        
        // 좌표를 입력받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
             // 각 줄을 읽어 StringTokenizer로 초기화
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(coordinate, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
            
        });
        
        

        // 좌표 출력
        for (int[] i : coordinate) {
            for (int j : i) {
                System.out.print(j + " "); // 각 좌표 출력
            }
            System.out.println(); // 줄 바꿈
        }
        
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}
