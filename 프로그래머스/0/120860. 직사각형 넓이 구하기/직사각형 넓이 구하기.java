class Solution {
    public int solution(int[][] dots) {
        int xMax = dots[0][0];
    int xMin = dots[0][0];
    int yMax = dots[0][1];
    int yMin = dots[0][1];

    for (int i = 1; i < dots.length; i++) {
      int x = dots[i][0];
      int y = dots[i][1];
      if (x > xMax) {
        xMax = x;
      }
      if (x < xMin) {
        xMin = x;
      }
      if (y > yMax) {
        yMax = y;
      }
      if (y < yMin) {
        yMin = y;
      }
    }
    return (xMax - xMin) * (yMax - yMin);
    }
}