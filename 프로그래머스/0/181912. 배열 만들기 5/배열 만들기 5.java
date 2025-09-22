import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).mapToInt(value -> Integer.parseInt(value.substring(s,s+l))).filter(v -> v > k).toArray();
        // List<Integer> list = new ArrayList<>();
        // for(String s1 : intStrs) {
        //     Integer i = Integer.parseInt(s1.substring(s, s + l));
        //     if(i > k) {
        //         list.add(i);
        //     }
        // }
        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}