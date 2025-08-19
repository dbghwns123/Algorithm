import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        String str = "ad";
        List<String> answer = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains(str)) {
                answer.add(s);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}