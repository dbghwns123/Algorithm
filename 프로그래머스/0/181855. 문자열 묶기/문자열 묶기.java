class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];
        for(String s : strArr) {
            arr[s.length()]++;
        }
        for(int i : arr) {
            if(answer < i) answer = i;
        }
        return answer;
    }
}