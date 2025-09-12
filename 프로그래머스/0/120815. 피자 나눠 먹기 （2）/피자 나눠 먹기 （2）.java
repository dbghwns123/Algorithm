import java.util.*;
class Solution {
    public int solution(int n) {
        int gcd = getGcd(n,6);
        return n / gcd;
    }
    public int getGcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return getGcd(b, a % b);
    }
}