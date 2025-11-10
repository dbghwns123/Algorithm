import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] nums) {
        // set을 사용하는 방법
//         Set<Integer> set = new HashSet<>();
//         for(int i : nums) {
//             set.add(i);
//         }
        
//         return Math.min(set.size(), nums.length / 2);
        
        // stream을 사용하는 방법
        // return Arrays.stream(nums)
        // .boxed()
        // .collect(Collectors.collectingAndThen(Collectors.toSet(),
        //     phonekemons -> Integer.min(nums.length / 2, phonekemons.size())));
        
        // HashMap를 사용하는 방법
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, 1);
        }
        return Math.min(map.size(), nums.length / 2);
    }
}