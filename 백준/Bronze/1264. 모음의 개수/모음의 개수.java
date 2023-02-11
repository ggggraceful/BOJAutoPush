import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String s = br.readLine();
			if(s.equals("#")) break;
			s = s.toLowerCase(); // 모두 소문자로 변환
            
            int answer = 0;
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
					answer++;
			}
			System.out.println(answer);
		}
	}
}
