import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        /**
     배열로 푸는 방법
     */
//    List<Integer> answer = new ArrayList<>();
//    int[] works = new int[progresses.length];
//
//    for(int i = 0; i < progresses.length; i++) {
//      works[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
//    }
//
//    int maxDay = works[0];
//    int count = 0;
//    for(int i : works) {
//      if(i > maxDay) {
//        maxDay = i;
//        answer.add(count);
//        count = 1;
//      } else {
//        count++;
//      }
//    }
//    answer.add(count);
//    return answer.stream().mapToInt(i -> i).toArray();

    /**
     * 큐로 푸는 방법
     */
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                q.add((100 - progresses[i]) / speeds[i]);
            } else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int x = q.poll();
        int count = 1;
        while (!q.isEmpty()) {
            if (x >= q.peek()) {
                count++;
                q.poll();
            } else {
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}