import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 숫자 A, B 입력
		String A = st.nextToken();
		String B = st.nextToken();

		// 순서를 뒤집고
		StringBuilder sb1 = new StringBuilder(A);
		StringBuilder sb2 = new StringBuilder(B);

		String reversedA = sb1.reverse().toString();
		String reversedB = sb2.reverse().toString();

		// 큰수 출력
		int num1 = Integer.parseInt(reversedA);
		int num2 = Integer.parseInt(reversedB);

		if(num1 > num2){
			sb.append(num1);
		} else
			sb.append(num2);

		System.out.println(sb);
	}
}

/*
----- 입력 -----
734 893

>> 입력받을 값을 일단 뒤집고,
뒤집은 수 중에 큰 수 출력

----- 출력 ----
437

 */

