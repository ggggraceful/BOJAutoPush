class Solution {
    public int[] solution(int n) {
        
		// 홀수라면 절반보다 1개가 많음
		int number_size = 0;
		if (n % 2 == 1) {
			number_size = n / 2 + 1;
		} else {
			number_size = n / 2;
		}

		int[] answer = new int[number_size];

		// 짝수+1 한 값들을 넣음
		for (int i=0; i<number_size; i++){
			answer[i] += i * 2 + 1;
		}

		return answer;
    }
}