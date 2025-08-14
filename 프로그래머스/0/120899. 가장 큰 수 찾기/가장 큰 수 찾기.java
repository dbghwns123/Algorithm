import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int maxNum = -1;
        int maxIdx = -1;

        for (int i = 0; i < array.length; i++) {
          if (array[i] > maxNum) {
            maxNum = array[i];
            maxIdx = i;
          }
        }

        return new int[]{maxNum, maxIdx};
    }
}