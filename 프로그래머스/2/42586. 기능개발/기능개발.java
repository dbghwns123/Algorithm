import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int[] works = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            works[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
        }
        
        int maxDay = works[0];
        int count = 0;
        for(int i : works) {
            if(i > maxDay) {
                maxDay = i;
                answer.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}