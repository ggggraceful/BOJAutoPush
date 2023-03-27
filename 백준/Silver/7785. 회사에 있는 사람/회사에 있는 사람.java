import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
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

		int list_size = list.size();
		for (int i = list_size - 1; i >= 0; i--) {
			bw.write(list.get(i) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
    }
}