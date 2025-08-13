class Solution {
    public int solution(int hp) {
        int a = 5;
        int b = 3;
        int c = 1;
        int count = 0;
        while (hp != 0) {
            count += hp / a;
            hp %= a;
            count += hp / b;
            hp %= b;
            count += hp / c;
            hp %= c;
        }
        return count;
    }
}