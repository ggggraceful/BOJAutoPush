import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		HashMap<String, String> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();

		while (N-- > 0) {
			String[] member = br.readLine().split(" ");
			map.put(member[0], member[1]);
		}

		for (String key : map.keySet()) {
			if (map.get(key).equals("enter")) {
				arr.add(key);
			}
		}

		Collections.sort(arr);

		for (int i = arr.size()-1; i >= 0; i--) {
			System.out.println(arr.get(i));
		}
	}
}