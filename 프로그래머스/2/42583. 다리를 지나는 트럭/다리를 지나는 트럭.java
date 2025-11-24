import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < bridge_length - 1; i++) {
            queue.offer(0);
        }
        
        int current = truck_weights[0];
        queue.add(current);
        
        int answer = 1;
        int index = 1;
        
        while(!queue.isEmpty()) {
            current -= queue.poll();
            answer++;
            
            if(index < truck_weights.length){
                // 다음 트럭 올려도 하중 제한 충족?
                if(current + truck_weights[index] <= weight){
                    current += truck_weights[index]; // 하중 반영
                    queue.add(truck_weights[index]);       // 맨 뒤 칸에 트럭 올림
                    index++;                           // 다음 트럭으로 이동
                }else{
                    queue.add(0); // 못 올리면 빈칸(0)을 넣어 '시간만 흐르게' 함
                }
            }
        }
        return answer;
    }
}