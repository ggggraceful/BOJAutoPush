import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] D = new int[N+1];
        
        for (int i = 1; i <= N; i++)
            D[i] = D[i-1] + arr[i-1];
        
        while (M-- > 0) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            sb.append(D[j] - D[i] + arr[i-1] + "\n");
        }
        System.out.print(sb);
    }
}