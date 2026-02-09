import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        for (String s : keyinput) {
          switch (s) {
            case "left" -> {
              if (answer[0] > -xLimit) {
                answer[0] -= 1;
              }
            }
            case "right" -> {
              if (answer[0] < xLimit) {
                answer[0] += 1;
              }
            }
            case "up" -> {
              if (answer[1] < yLimit) {
                answer[1] += 1;
              }
            }
            case "down" -> {
              if (answer[1] > -yLimit) {
                answer[1] -= 1;
              }
            }
          }
        }
        return answer;
    }
}