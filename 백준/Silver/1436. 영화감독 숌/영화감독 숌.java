import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int reqMovieNo = Integer.parseInt(br.readLine());

		int contain666 = 666;
		int count = 1;

		while (count != reqMovieNo) {
			contain666++;
			if(String.valueOf(contain666).contains("666")){
				count++;
			}
		}

		System.out.println(contain666);
	}

}