class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for (String s : myString.split("")) {
          if (s.equals("A")) {
            answer += "B";
          } else {
            answer += "A";
          } 
        }
        return answer.contains(pat) ? 1 : 0;
    }
}