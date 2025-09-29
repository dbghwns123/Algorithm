class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for(int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            if(str.contains(strK)) {
                for(String s : str.split("")) {
                    if(s.equals(strK)) answer++;
                }
            }
        }
        return answer;
    }
}