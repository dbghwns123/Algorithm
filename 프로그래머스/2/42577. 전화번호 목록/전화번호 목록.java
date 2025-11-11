import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // 정렬 + 인접 비교
        // Arrays.sort(phone_book);
        // for(int i = 0; i < phone_book.length - 1; i++) {
        //     if(phone_book[i + 1].startsWith(phone_book[i])) {
        //         return false;
        //     }
        // }
        // return true;
        
        // HashSet 사용
        Set<String> set = new HashSet<>();
        for(String s : phone_book) {
            set.add(s);
        }
        for(String s : phone_book) {
            for(int i = 1; i < s.length(); i++) {
                if(set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}