import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
        // List<String> list = new ArrayList();
        // for(String s : myString.split("x")) {
        //     if(!s.isEmpty()) {
        //         list.add(s);
        //     }
        // }
        // Collections.sort(list);
        // return list.toArray(new String[0]);
    }
}