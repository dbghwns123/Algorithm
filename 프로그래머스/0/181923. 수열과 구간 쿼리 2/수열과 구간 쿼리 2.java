import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
          int num = -1;
          for (int j = queries[i][0]; j <= queries[i][1]; j++) {
            if (arr[j] > queries[i][2] && (num == -1 || num > arr[j])) {
              num = arr[j];
            }
          }
          answer[i] = num;
        }
        return answer;
    }
}