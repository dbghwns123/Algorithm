import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        for (String s : myString.split("x", myString.length())) {
            list.add(s.length());
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}