import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c - 'a' >= 0) {
                answer[c - 'a' + 26] += 1;
            }else {
                answer[c - 'A'] += 1;
            }
        }
        return answer;
    }
}