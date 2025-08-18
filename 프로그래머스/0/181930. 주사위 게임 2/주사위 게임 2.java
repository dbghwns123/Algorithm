import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        int sum = a + b + c;
        int x2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int x3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (set.size() == 3) {
            return sum;
        } else if (set.size() == 2) {
            return sum * x2;
        } else {
            return sum * x2 * x3;
        }
    }
}