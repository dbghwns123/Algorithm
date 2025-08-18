class Solution {
    public int solution(int num, int k) {
        String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
          if (split[i].equals(String.valueOf(k))) {
            return i + 1;
          }
        }
        return -1;
    }
}