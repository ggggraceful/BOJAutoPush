import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String S = st.nextToken();
		String E = st.nextToken();
		String Q = st.nextToken();

		Set<String> before = new HashSet<>();
		Set<String> after = new HashSet<>();
		Set<String> nameSet = new HashSet<>();
		String str;

		while((str = br.readLine()) != null) {
			String[] arr = str.split(" ");
			String time = arr[0];
			String name = arr[1];

			nameSet.add(name);
			if(0 <= S.compareTo(time)) {
				before.add(name);
			}else if(E.compareTo(time) <= 0 
					&& 0 <= Q.compareTo(time)) {
				after.add(name);
			}
		}

		int answer = 0;
		for(String name : nameSet) {
			if(before.contains(name) && after.contains(name)) {
				answer += 1;
			}
		}
		System.out.println(answer);
	}
}