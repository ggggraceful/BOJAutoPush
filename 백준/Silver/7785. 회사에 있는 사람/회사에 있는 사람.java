import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			String name = st.nextToken();
			String state = st.nextToken();

			if (state.equals("enter")) {
				set.add(name);
			}else if (state.equals("leave")) {
				set.remove(name);
			}
		}
		ArrayList<String> list = new ArrayList(set);
		Collections.sort(list);

		for (int i = list.size()-1; i >= 0; i--) {
			bw.write(list.get(i) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}