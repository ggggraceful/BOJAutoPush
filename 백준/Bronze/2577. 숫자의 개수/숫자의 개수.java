import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int multiply = A * B * C;
		String str = String.valueOf(multiply);

		int[] arr = new int[10];

		int str_len = str.length();
		for (int i = 0; i < str_len; i++) {
			arr[(str.charAt(i) - 48)]++; // arr[0], arr[1]...
		}

		for (int answer : arr) {
			System.out.println(answer);
		}

	}
}