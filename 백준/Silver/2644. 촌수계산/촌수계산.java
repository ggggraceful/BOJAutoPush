import java.io.*;
import java.util.*;

public class Main {
	static int[][] family;
	static boolean[] check;
	static int answer, n, m;
	static boolean find;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		family = new int[n][n];
		check = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken())-1;
		int b = Integer.parseInt(st.nextToken())-1;

		m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			family[x][y] = 1;
			family[y][x] = 1;
		}

		dfs(a, b, 0);

		if (!find) answer = -1;
		System.out.println(answer);
	}

	public static void dfs(int x, int y, int cnt) {
		check[x] = true;

		if(x == y) {
			find = true;
			answer = cnt;
			return;
		}

		for (int i = 0; i < n; i++) {
			if(!check[i] && family[x][i] == 1) {
				check[i] = true;
				dfs(i, y, cnt+1);
				check[i] = false;
			}
		}

	}
}