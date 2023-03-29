import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[11];

		Arrays.fill(arr, -1);
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cow = Integer.parseInt(st.nextToken());
			int cross = Integer.parseInt(st.nextToken());

			if (arr[cow] != -1 && arr[cow] != cross) cnt++;
			arr[cow] = cross;
		}
		System.out.println(cnt);
    }    
}