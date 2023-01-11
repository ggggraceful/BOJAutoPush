import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();

		// 각 문자를 순회하며 해당 문자가 처음 등장한 위치를 찾는다.
		// indexOf : 찾는 문자열이 없으면 -1을 리턴, 
		//           해당하는 알바벳 자리에 숫자로 순서 표시
		for(char c = 'a' ; c <= 'z' ; c++){
			sb.append(s.indexOf(c)).append(" ");
		}

		System.out.println(sb);
	}
}