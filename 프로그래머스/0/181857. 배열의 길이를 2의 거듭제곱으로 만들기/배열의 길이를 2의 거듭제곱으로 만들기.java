import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int a = 2;
        if(arrLength == 1) {
            return arr;
        }
        while(a < arr.length) {
            a *= 2;
        }
        return Arrays.copyOf(arr, a);
    }
}