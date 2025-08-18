import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> delete_list1 = new ArrayList<>();
        for (int i : arr) {
          list.add(i);
        }
        for (int i : delete_list) {
          delete_list1.add(i);
        }

        list.removeAll(delete_list1);
        return list.stream().mapToInt(i -> i).toArray();
    }
}