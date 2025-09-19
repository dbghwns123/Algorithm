import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(String s : str.split("")) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        return answer;
        // int answer = 0;
        // while(order > 0) {
        //     if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
        //         answer++;
        //     }
        //     order /= 10;
        // }
        // return answer;
    }
}