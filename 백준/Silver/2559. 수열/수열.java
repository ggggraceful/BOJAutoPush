import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int max = -100 * K;
		int[] arr = new int[N];
		int[] accumulate = new int[N+1];

		// 모든 수를 배열에 삽입
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 누적값들을 더해준 배열을 생성
		for(int i = 0; i < N; i++) {
			accumulate[i+1] = accumulate[i] + arr[i];
		}

		for(int i = 0; i <= N - K ; i++) {
			// 원래의 최대값과 현재 계산한 값을 비교해 큰 값을 max에 저장
			max = Math.max(max, accumulate[i + K] - accumulate[i]);
		}

		System.out.println(max);
	}
}