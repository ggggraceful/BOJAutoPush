import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if(abs1==abs2)
				return o1 > o2 ? 1:-1;
			return abs1 - abs2;
		});
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input==0) {
				if(pq.isEmpty())
					answer.append("0\n");
				else {
					answer.append(Integer.toString(pq.poll())+"\n");
				}					
			}
			else
				pq.add(input);
		}
		
		bw.write(new String(answer));
		
		bw.flush();
	}
}