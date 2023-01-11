import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String number1Str = br.readLine();
		String number2Str = br.readLine();

		printAnswer(number1Str, number2Str);
	}

	static void printAnswer(String number1Str, String number2Str) {

		StringBuilder sb = new StringBuilder();

		int number1 = Integer.parseInt(number1Str); // parseInt() :  String 타입의 숫자를 int 타입으로 변환

		// number1 * number2 의 1의 자리수
		// number1 * number2 의 10의 자리수
		// number1 * number2 의 100의 자리수
		// number1 * number2
		sb.append(number1 * (number2Str.charAt(2)-'0')) // number2Str 의 1의 자리수
				.append("\n")
				.append(number1 * (number2Str.charAt(1) - '0'))  // number2Str 의 10의 자리수
				.append("\n")
				.append(number1 * (number2Str.charAt(0) - '0')) // number2Str 의 100의 자리수
				.append("\n")
				.append(number1 * Integer.parseInt(number2Str));  

		System.out.println(sb);
	}

}