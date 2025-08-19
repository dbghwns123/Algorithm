import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1)).mapToInt(v -> v.length()).toArray();
    }
}