class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String seven = "7";
        for(int i : array) {
            if((i + "").contains(seven)) {
                for(String s : (i + "").split("")) {
                    if(s.equals(seven)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}