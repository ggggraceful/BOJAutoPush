import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int count = 0; //반복횟수를 체크하기 위한 변수
		int result = 0; //범위내 누적합을 구하기 위한 변수

		for(int i=1;i<=b;i++) { 
			for(int j=1;j<=i;j++) {
				count++;

				if(a<=count && count<=b) { //만약 반복횟수가 a와 b사이라면
					result += i; //그때의 데이터 i의 누적합을 구한다. 
				}
			}
		}

		System.out.println(result);

	}
}