class Solution {
    public String solution(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        String answer = "";
        for(int i = 0; i < 26; i++){
            if(arr[i] == 1){
                answer += ((char)(i + 'a'));
            }
        }
        return answer;
    }
}