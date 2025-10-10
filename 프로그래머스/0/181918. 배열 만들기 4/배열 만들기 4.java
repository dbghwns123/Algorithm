import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        while(i < arr.length) {
            if(stack.isEmpty()) {
                stack.push(arr[i++]);
            }else {
                if(stack.getLast() < arr[i]) {
                    stack.addLast(arr[i++]);
                }else {
                    stack.removeLast();
                }
            }
        }
        return stack.stream().mapToInt(j -> j).toArray();
    }
}