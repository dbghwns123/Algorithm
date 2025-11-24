import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int cur = prices[i];
            int notLow = 0;
            for(int j = i + 1; j < prices.length; j++) {
                notLow++;
                if(prices[j] < cur) {
                    break;
                }
            }
            answer[i] = notLow;
        }
        answer[answer.length - 1] = 0;
        return answer;
    }
}