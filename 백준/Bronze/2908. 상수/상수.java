import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String num1 = st.nextToken();
		String num2 = st.nextToken();

		// 입력받은 숫자들을 뒤집는다.
		String reverseNum1 = new StringBuilder(num1).reverse().toString();
		String reverseNum2 = new StringBuilder(num2).reverse().toString();

		// 뒤집힌 숫자중 큰 숫자를 판별하여 출력한다.
		String result = reverseNum1.compareTo(reverseNum2) > 0 ?
				reverseNum1:
				reverseNum2;

		System.out.println(result);
	}
}