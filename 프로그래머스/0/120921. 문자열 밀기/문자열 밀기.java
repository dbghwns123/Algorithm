class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int count = 0;

        while (count < A.length()) {
          if (A.equals(B)) {
            return answer;
          }
          A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
          count++;
          answer++;
        }

        return -1;
    }
}