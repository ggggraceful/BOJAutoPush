import java.io.*;
import java.util.*;

public class Main {	
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[][] c = new char[5][15];
		int max = 0;

		int c_length = c.length;
		for (int i = 0; i < c_length; i++) {
			String str = br.readLine();
			// 최대 길이를 max 변수에 저장한다.
			if(max < str.length()) max = str.length();
			// 입력받은 문자열을 char 2차원 배열에 담는다.
			for (int j = 0; j < str.length(); j++) {
				c[i][j] = str.charAt(j);
			}
		}

		// 세로로 읽으므로 열과 행으로 출력하고, 값이 '\0'인 경우 넘어간다.
		// ※ char 배열의 초기 값은 '\0' 이다.
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (c[j][i] == '\0') continue;
				sb.append(c[j][i]);
			}
		}

		System.out.println(sb);
	}
}
