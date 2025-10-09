import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int arrLen = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[arrLen];
        int begin = 0;
        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) {
                answer[i] = my_str.substring(begin);
            } else {
                answer[i] = my_str.substring(begin, begin + n);
            }
            begin += n;
        }
        return answer;
    }
}