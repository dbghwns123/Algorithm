import java.util.*;
import java.time.*;
class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0],date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0],date2[1], date2[2]);
        return dateA.isBefore(dateB) ? 1 : 0;
//         Date d1 = new Date(date1[0], date1[1], date1[2]);
//         Date d2 = new Date(date2[0], date2[1], date2[2]);

//         if (d1.compareTo(d2) < 0) {
//             return 1;
//         } else {
//             return 0;
//         }
    }
}