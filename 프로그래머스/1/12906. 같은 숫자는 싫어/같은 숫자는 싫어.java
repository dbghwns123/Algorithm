import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i : arr) {
            if(stack.isEmpty() || stack.peekLast() != i) {
                stack.addLast(i);
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stack.pollFirst();
        }
        return answer;
        
    }
}