class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] split = code.split("");
        for(int i = r; i < code.length(); i += q) {
            answer += split[i];
        }
        return answer;
    }
}