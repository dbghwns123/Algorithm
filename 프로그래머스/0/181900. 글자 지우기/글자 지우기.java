import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        int a = 0;
        Arrays.sort(indices);
        for (int index : indices) {
          sb.deleteCharAt(index - a);
          a++;  
        }
        return sb.toString();
    }
}