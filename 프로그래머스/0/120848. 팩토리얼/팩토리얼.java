class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 1;
        
        for (int i=1; i <= n; i++){
            if (factorial(i) > n) {
                break;
            } else {
                result = i;
            }
        }
        return result;
        
    }
    
    private int factorial (int n) {
        int result  = 1;
        for (int i=1; i <= n; i++){
            result = result*i;
        }
        return result;
    }
}