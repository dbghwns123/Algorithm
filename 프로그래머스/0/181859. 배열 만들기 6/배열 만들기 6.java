import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(list.isEmpty()) {
                list.add(arr[i]);
            } else if(arr[i] == list.get(list.size() - 1)) {
                list.remove(list.size() - 1);
            }else {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) {
            return new int[]{-1};
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}