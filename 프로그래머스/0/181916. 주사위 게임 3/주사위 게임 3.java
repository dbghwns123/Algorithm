import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if (map.size() == 1) {
          return 1111 * a;
        } else if (map.size() == 2 && map.containsValue(3)) {
          int three = 0;
          int one = 0;
          for (Integer i : map.keySet()) {
            if (map.get(i) == 3) {
              three = i;
            } else {
              one = i;
            } 
          }
          return (10 * three + one) * (10 * three + one);
        } else if (map.size() == 2) {
          int p = 0;
          int q = 0;
          for (Integer i : map.keySet()) {
            if (p == 0) {
              p = i;
            } else {
              q = i;
            } 
          }
          return (p + q) * Math.abs(p - q);
        } else if (map.size() == 3) {
          int q = 0;
          int r = 0;
          for (Integer i : map.keySet()) {
            if (map.get(i) != 2 && q == 0) {
              q = i;
            } else if (map.get(i) != 2) {
              r = i;
            }
          }
          return q * r;
        } else {
          int min = Integer.MAX_VALUE;
          for (Integer i : map.keySet()) {
            min = Math.min(min, i);
          }
          return min;  
        } 
    }
}