import java.util.*;
class Solution {
    public int solution(int[] date1, int[] date2) {
        Date d1 = new Date(date1[0], date1[1], date1[2]);
        Date d2 = new Date(date2[0], date2[1], date2[2]);

        if (d1.compareTo(d2) < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}