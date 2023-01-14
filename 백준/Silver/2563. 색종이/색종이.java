import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] backgroundArray = new boolean[100][100];

		int paperCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < paperCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			//색종이가 차지하는 부분인 곳에 배열값은 true
			for (int j = x; j < (x + 10); j++) { // 색종이의 밑변 x ~ 10
				for (int k = y; k < (y + 10); k++) { // 색종이의 높이 y ~ 10
					backgroundArray[j][k] = true;
				}
			}
		}
		br.close();

		int black = 0;  // true : false ?????
		for (boolean[] array : backgroundArray) { // true인 것이 array
			for (boolean check : array) { // 그중 한번 더 true인 것이 check
				if (check) black++; // check : 중복 색칠되어있는 true의 수 black에 넣음
			}
		}
		System.out.println(black);
	}
}