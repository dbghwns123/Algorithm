import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]", " ");
        my_string = my_string.replaceAll("[A-Z]", " ");
        
        String[] arr = my_string.split(" ");
        for(String s : arr) {
            if(!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
        
    }
}