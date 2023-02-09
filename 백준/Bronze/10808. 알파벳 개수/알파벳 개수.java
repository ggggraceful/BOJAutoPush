import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String word = br.readLine();
		int[] count = new int[26];

		for (int i = 0; i < word.length(); i++) {
			count[(int) word.charAt(i) - 97] += 1; 
        }

		for (int i = 0; i < count.length; i++) {
			sb.append(count[i]); 
			sb.append(" ");
		}

		System.out.println(sb);
	}
}