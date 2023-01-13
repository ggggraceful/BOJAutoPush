import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// X보다 작은 수
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer A = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(A.nextToken());
		int X = Integer.parseInt(A.nextToken());

		StringBuilder sb = new StringBuilder();
		A = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(A.nextToken());

			if (value < X) // X 보다 작을 때 출력
				sb.append(value).append(' ');
		}

		System.out.println(sb);
	}
}