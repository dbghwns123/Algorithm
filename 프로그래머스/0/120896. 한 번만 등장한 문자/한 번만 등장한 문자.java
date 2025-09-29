import java.util.*;
class Solution {
    public String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";

        for (String s1 : s.split("")) {
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return String.join("", list);
    }
}