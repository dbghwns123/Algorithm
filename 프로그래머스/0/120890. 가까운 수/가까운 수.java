import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = -1;
        int diff = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            
            if(Math.abs(n - array[i]) < diff) {
                answer = array[i];
                diff = Math.abs(n - array[i]);
            } else if(Math.abs(n - array[i]) == diff) {
                answer = answer < array[i] ? answer : array[i];
            }
        }
        
        return answer;
    }
}