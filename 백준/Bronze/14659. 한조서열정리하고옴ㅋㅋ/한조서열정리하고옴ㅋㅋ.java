import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int [] mt = new int [N];

		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			mt[i] = Integer.parseInt(st.nextToken());

		int answer = 0; // 최종 결과
		int cnt = 0; // 최대 높이가 갱신 될 때마다 새로 카운트
		int high = 0;

		for(int i = 0; i < N; i++) {
			// 최대 높이가 갱신이 되면 최대 높이를 바꾸고 자기 보다 작은 높이를 찾는 것을 새로 시작
			if (mt[i] > high) {
				high = mt[i];
				cnt = 0;
			} else cnt++;

			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
	}
}