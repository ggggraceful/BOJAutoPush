import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			sb.append(location_cnt(x1, y1, r1, x2, y2, r2)).append('\n');
		}
		System.out.println(sb);
	}

	// 류가 존재할 수 있는 좌표의 수
	public static int location_cnt(int x1, int y1, int r1, int x2, int y2, int r2) {

		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// case 1 : 조(1),백(2) 중점이 같고, 반지름도 같은 경우
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1; // 무한대
		}
		// case 2 : 조(1),백(2)의 범위를 넘어버리는 경우
		else if(distance > Math.pow(r1 + r2, 2)) {
			return 0; // no cnt
		}
		// case 3 : 서로 내의 범위에 있지만, 조(1),백(2)의 범위 중 접하는 범위가 없을 경우
		else if(distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		// case 4 : 내접할 경우
		else if(distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		// case 5 : 외접할 경우
		else if(distance == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		// case 6 : 그 외의 경우, 일반적인 경우
		else {
			return 2;
		}
	}
}
