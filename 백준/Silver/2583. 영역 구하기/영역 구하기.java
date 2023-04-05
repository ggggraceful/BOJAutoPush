import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int m, n, k, count;
	static int[][] arr;
	static boolean[][] visited;
	static List<Integer> list = new ArrayList<>();
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[m][n];
		visited = new boolean[m][n];

		while (k-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int i = y1; i < y2; i++) {
				for (int j = x1; j < x2; j++) {
					arr[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					count = 0;
					solve(i, j);
					list.add(count);
				}
			}
		}

		Collections.sort(list);
		System.out.println(list.size());
		for (Integer number : list) {
			System.out.print(number + " ");
		}
	}

	public static void solve(int x, int y) {
		count += 1;
		visited[x][y] = true;
		arr[x][y] = 1;
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX >= 0 && nextY >= 0 && nextX < m && nextY < n) {
				if (!visited[nextX][nextY] && arr[nextX][nextY] == 0) {
					solve(nextX, nextY);
				}
			}
		}
	}
}