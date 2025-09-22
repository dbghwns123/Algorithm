import java.util.stream.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(v -> included[v] ? a + (d * v) : 0).sum();
        // int answer = 0;
        // for (int i = 0; i < included.length; i++) {
        //     if (included[i]) {
        //         answer += a + (d * i);
        //     }
        // }
        // return answer;
    }
}