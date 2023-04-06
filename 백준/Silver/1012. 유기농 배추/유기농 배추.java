import java.io.*;
import java.util.*;

public class Main {
    
    static int T; // testcase
	static int M; // 가로 길이
	static int N; // 세로 길이
	static int K; // 배추가 심어져있는 위치의 개수
	static int[][] cabbage;
	static boolean[][] visit;
	static int count;
    
    static int[] dx = {-1, 1, 0, 0};
    //                 좌  우  
	static int[] dy = {0, 0, -1, 1};
    //                       상  하

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            count=0;

  			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken()); // 가로길이
			N = Integer.parseInt(st.nextToken()); // 세로길이
			K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치 개수

            cabbage = new int[M][N];
            visit = new boolean[M][N];

            // 배추가 위치하는 곳에 1을 넣어줌
            for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
                cabbage[a][b] = 1;
            }

			for (int x = 0; x < M; x++) { // 가로
				for (int y = 0; y < N; y++) { // 세로
					// 배추가 위치하고, 아직 그 지점에 방문하지 않았다면 -> dfs 실행
					if (cabbage[x][y] == 1 && !visit[x][y]) {
						dfs(x, y);
						// 배추 수확
						count++;
					}
				}
			}
			System.out.println(count);
		}
    }
    
    
	static void dfs(int x, int y){
		// 방문 확인
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int xx = dx[i] + x;
			int yy = dy[i] + y;

			// 범위를 벗어난다면 그냥 통과
			if (xx >= 0 && yy >= 0 && xx < M && yy < N &&
					// 해당 정점에 방문하지 않았고
					!visit[xx][yy] &&
					// 배추가 존재하는 곳이라면
					cabbage[xx][yy] == 1) {
				dfs(xx, yy);
			}
		}
    }
}
