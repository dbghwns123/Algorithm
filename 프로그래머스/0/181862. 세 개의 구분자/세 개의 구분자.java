import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();

        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");

        for (String s : myStr.split(" ")) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}