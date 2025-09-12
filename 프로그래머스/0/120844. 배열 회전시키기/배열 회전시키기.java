import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
    if (direction.equals("right")) {
      Integer remove = list.remove(list.size() - 1);
      list.add(0, remove);
    } else {
      Integer remove = list.remove(0);
      list.add(remove);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}