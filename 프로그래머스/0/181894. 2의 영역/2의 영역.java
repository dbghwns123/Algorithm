import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int a = -1;
        int b = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                a = i;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                b = i;
                break;
            }
        }
        
        if(a == -1) {
            int[] newArr = {-1};
            return newArr;
        }else if (a == b) {
            return Arrays.copyOfRange(arr,a,b + 1);
        }else {
            return Arrays.copyOfRange(arr,a,b+1);
        }
        
    }
}