import java.io.*;
import java.util.*;

public class Main {

	// https://withthemilkyway.tistory.com/24
	private static final int [] dx = {-1, 1,  0, 0};
									// 상  하
	private static final int [] dy = {  0, 0, -1, 1};
									//         좌  우
	private static int N;
	private static int [][] map;
	private static boolean [][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine()); // 2차원 배열의 행과 열의 개수

		int max = 0;
		int min = 100;

		map = new int[N][N];
		
		// 2차원 배열을 채워줌
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				// 최대값
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
		}

		visited = new boolean[N][N];
		int answer = 1;

		for (int height = max; min <= height; height--) {
			int count = 0;
			// 2차원 배열에서
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					// 아직 잠기지 않지만, 방문하지 않은 지점에서 dfs
					if (map[i][j] > height && !visited[i][j]) {
						dfs(i, j, height);
						count++;
					}
				}
			}

			visited = new boolean[N][N];
			answer = Math.max(answer, count);
		}

		System.out.println(answer);
	}

	private static void dfs(int x, int y, int height) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (map[nx][ny] > height && !visited[nx][ny]) {
					dfs(nx, ny, height);
				}
			}
		}
	}

}
