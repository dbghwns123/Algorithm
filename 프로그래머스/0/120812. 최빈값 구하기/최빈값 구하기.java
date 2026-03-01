class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
    for (int i : array) {
      count[i]++;
    }
    
    int maxCount = 0;
    boolean isDuplicate = false;
    int answer = -1;

    for (int i = 0; i < count.length; i++) {
      if (maxCount < count[i]) {
        isDuplicate = false;
        maxCount = count[i];
        answer = i;
      } else if (maxCount == count[i] && maxCount > 0) {
        isDuplicate = true;
      }
    }

    if (isDuplicate) {
      return -1;
    } else {
      return answer;
    }
    }
}