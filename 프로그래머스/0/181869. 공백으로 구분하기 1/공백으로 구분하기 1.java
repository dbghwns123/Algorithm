import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        for (String s : my_string.split(" ")) {
            answer.add(s);
        }
        return answer.toArray(new String[answer.size()]);
    }
}