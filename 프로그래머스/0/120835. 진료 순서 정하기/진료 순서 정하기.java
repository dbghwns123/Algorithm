import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortedArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedArr);
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < sortedArr.length; j++) {
                if(emergency[i] == sortedArr[j]) {
                    answer[i] = emergency.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}