import java.util.*;
class Solution {
    public int solution(String before, String after) {
        
        String[] splitB = before.split("");
        String[] splitA = after.split("");
        Arrays.sort(splitB);
        Arrays.sort(splitA);
        return Arrays.equals(splitB, splitA) ? 1 : 0;
        
    }
}