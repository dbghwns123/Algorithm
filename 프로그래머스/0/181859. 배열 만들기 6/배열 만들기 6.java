import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.getLast()) {
                stack.removeLast();
            } else {
                stack.addLast(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }
}