import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr;

		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i = 0 ; i < testcase ; i++) { // testcase 만큼 반복

			st = new StringTokenizer(br.readLine()," "); //  학생수와 성적 입력 + 공백으로 분리

			int N = Integer.parseInt(st.nextToken());	// 학생 수
			arr = new int[N];

			double sum = 0;	// 성적 누적 합 변수

			// 성적 입력부분
			for(int j = 0 ; j < N ; j++) { // 학생수만큼 연산 반복
				int score = Integer.parseInt(st.nextToken());	// 성적 저장
				arr[j] = score; // 배열의 j번재 있는 성적
				sum += score;	// 성적 누적 합
			}

			double mean = (sum / N) ; // mean: 평균
			double count = 0; // 평균 넘는 학생들의 수

			// 평균 넘는 학생 비율 찾기
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) { // arr에 있는 j번째 점수가 평균을 넘는가?
					count++; // 평균 넘는 학생들의 수
				}
			}

			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
	}
}
