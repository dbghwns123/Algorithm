class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (String i : rsp.split("")) {
            if (i.equals("2")) {
                answer += "0";
            } else if (i.equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}