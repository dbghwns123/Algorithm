import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        return String.join("",set);
        // return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
        // String answer = "";
        // for(String s : my_string.split("")) {
        //     if(!answer.contains(s)) {
        //         answer += s;
        //     }
        // }
        // return answer;
    }
}