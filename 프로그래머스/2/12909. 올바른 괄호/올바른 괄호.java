import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s1 : s.split("")) {
            if(s1.equals("(")) {
                stack.addLast("(");
            } else {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pollLast();
                }
            }
        }
        return stack.isEmpty();
    }
}