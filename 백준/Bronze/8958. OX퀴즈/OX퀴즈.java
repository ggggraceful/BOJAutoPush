import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());	//테스트 케이스

		String arr[] = new String[testcase];

		for (int i = 0; i < testcase; i++) { // testcase 횟수만큼 arr 입력
			arr[i] = br.readLine();
		}

		for (int i = 0; i < testcase; i++) {

			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산

			for (int j = 0; j < arr[i].length(); j++) { // arr의 길이 만큼 연산을 반복
				if (arr[i].charAt(j) == 'O') { // O 라는 문자가 나타나면
					cnt++; // cnt 을 1 증가
				} else {  // 'O'가 아닐 경우 'X'
					cnt = 0; // cnt를 0으로 초기화
				}
				sum += cnt;
			}

			sb.append(sum).append('\n');
		}

		System.out.print(sb);
	}
}