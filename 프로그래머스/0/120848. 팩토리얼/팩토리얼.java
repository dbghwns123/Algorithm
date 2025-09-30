class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        for(int i = 1; i <= 10; i++) {
            a *= i;
            if(a == n) {
                return i;
            } else if(a < n) {
                answer = i;
            } else {
                return answer;
            }
        }
        return answer;
    }
}