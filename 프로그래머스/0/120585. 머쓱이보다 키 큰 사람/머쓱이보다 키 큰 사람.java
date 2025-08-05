class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        for (int i : array) {
            cnt += height < i ? 1 : 0;
            
        }
        return cnt;
    }
}