import java.io.*;
import java.util.*;

public class Main {
    
	static int N, M;
	static int arr[][];
	static boolean visit[];
	static int answer;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 정점
		M = Integer.parseInt(st.nextToken()); // 간선

		arr = new int[N+1][N+1];  // 정점의 개수로 이중 배열
		visit = new boolean[N+1]; // 정점 방문 여부를 확인하기 위한 배열

		// 간선들을 이중 배열에 담아줌, 입력된 간선의 점은 1을 넣어 표시
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			arr[u][v] = arr[v][u] = 1;
		}

		// 방문한 적이 없다면 dfs 실행 
		for (int i = 1; i < N+1; i++) {
			if (!visit[i]) {
				dfs(i);
				answer++; 
			}
		}
        System.out.println(answer);
	}

	public static void dfs(int idx) {
		visit[idx] = true;
		for (int i = 1; i < N+1; i++) {
			// 해당 정점에 방문하지 않았고, 해당 idx와 관련된 지점 중 간선으로 이어져 있는 부분이 있을 시 -> dfs 재실행
			if (!visit[i] && arr[idx][i] == 1) { 
                dfs(i); 
            }
		}
	}
}
