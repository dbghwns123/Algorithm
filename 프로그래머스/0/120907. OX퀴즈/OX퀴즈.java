import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
    for (String s : quiz) {
      String[] split = s.split(" ");
      int a = Integer.parseInt(split[0]);
      String operator = split[1];
      int b = Integer.parseInt(split[2]);
      int c = Integer.parseInt(split[4]);
      if (operator.equals("+")) {
        answer[Arrays.asList(quiz).indexOf(s)] = (a + b == c) ? "O" : "X";
      } else {
        answer[Arrays.asList(quiz).indexOf(s)] = (a - b == c) ? "O" : "X";
      }
    }
    return answer;
    }
}