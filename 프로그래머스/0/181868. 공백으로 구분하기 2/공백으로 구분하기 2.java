import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
    String[] split = my_string.split(" ");
    for (String s : split) {
      String trim = s.trim();
      if (!trim.isEmpty()) {
        list.add(trim);
      }
    }
    return list.toArray(new String[0]);
    }
}