import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int size = n % 2 == 0 ? n / 2 : n / 2 + 1;

        int[] result = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];

        for (int i = 0; i < size; i++) {
            result[i] = i * 2 + 1;
        }
        return result;
    }
}