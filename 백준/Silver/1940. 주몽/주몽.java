import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주몽 = 투 포인터
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr); // 오름차순으로 정렬 후 시작
		int count = 0;
		int i = 0;
		int j = N - 1;

		// 투 포인터 이동 원칙 따라 포인터를 이동하며 처리
		while (i < j) {
			if (arr[i] + arr[j] < M) {
				i++;
			} else if (arr[i] + arr[j] > M) {
				j--;
			} else {
				count++;
                i++;
                j--;
			}
		}
		System.out.println(count);
    }
}