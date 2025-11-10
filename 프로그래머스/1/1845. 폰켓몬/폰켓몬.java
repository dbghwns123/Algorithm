import java.util.*;
class Solution {
    public int solution(int[] nums) {
        // set을 사용하는 방법
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        
        return Math.min(set.size(), nums.length / 2);
    }
}