import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for(int i : indices) {
            arr[i] = "";
        }
        return String.join("",arr);
        // StringBuilder sb = new StringBuilder(my_string);
        // int a = 0;
        // Arrays.sort(indices);
        // for (int index : indices) {
        //   sb.deleteCharAt(index - a);
        //   a++;  
        // }
        // return sb.toString();
    }
}