import java.util.*;
class Solution {
    public String solution(int age) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String answer = "";
        String[] split = String.valueOf(age).split("");
        for(String s : split){
            answer += arr[Integer.parseInt(s)];
        }
        
        return answer;
    }
}