import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue() != 0) {
                return e.getKey();
            }
        }
        return "";
    }
}