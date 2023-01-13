import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 평균
public class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");

		int max = 0; 
		float sum = 0;

		for(int i = 0; i < size; i++) {
			if(max < Integer.parseInt(str[i])) {
				max = Integer.parseInt(str[i]);
			}
			sum += Integer.parseInt(str[i]);
		}

		System.out.println((double) Math.round((sum / max) * 100) / size); 

	}
}