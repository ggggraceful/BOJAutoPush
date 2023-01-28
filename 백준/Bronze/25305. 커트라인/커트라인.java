import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());  // (입력)첫째줄
		int n = Integer.parseInt(st.nextToken()); // (입력)응시자 수
		int k = Integer.parseInt(st.nextToken()); // (입력)상을 받는 사람의 수

		int[] arr = new int[10001];
        
		st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<n; i++){
			arr[Integer.parseInt(st.nextToken())]++;
		}

		for(int i=10000; i>=0; i--){ // 높은 순서대로 카운팅해야 하므로 거꾸로 탐색
			while(arr[i]>0){
				arr[i]--; 
				k--; 

				if(k==0){
					System.out.println(i);
					break;
				}
			}
		}
	}
}