import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> total = new HashMap<>();
        Map<String, Map<Integer, Integer>> music = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            if(!total.containsKey(genres[i])) {
                
                Map<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                total.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                total.put(genres[i], total.get(genres[i]) + plays[i]);
            }
        }
        List<String> keySet = new ArrayList(total.keySet());
        Collections.sort(keySet, (s1, s2) -> total.get(s2) - total.get(s1));
        
        for(String s : keySet) {
            Map<Integer, Integer> map = music.get(s);
            List<Integer> genre_key = new ArrayList(map.keySet());
            
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
            
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}