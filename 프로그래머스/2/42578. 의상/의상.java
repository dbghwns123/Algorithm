import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] s1 : clothes) {
            map.put(s1[1], map.getOrDefault(s1[1], 0) + 1);
        }
        for(int i : map.values()) {
            answer *= (i + 1);
        }
        return answer - 1;
    }
}