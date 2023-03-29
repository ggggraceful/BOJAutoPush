import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[] c = br.readLine().toCharArray();
		int c_len = c.length;

		for (int i = 0; i < c_len; i++) {
			if(c[i] - 3 <'A') {
				sb.append((char) (c[i] + 23));
			}
			else {
				sb.append((char) (c[i] - 3));
			}
		}
		System.out.println(sb);
	}
}
