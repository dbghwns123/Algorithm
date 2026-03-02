class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
       for (int j = 0; j < board[i].length; j++) {
         if (board[i][j] == 1) {
           continue;
         }
         for (int x = -1; x <= 1; x++) {
           if (i + x < 0 || i + x >= board.length) {
             continue;
           }
           for (int y = -1; y <= 1; y++) {
             if (j + y < 0 || j + y >= board[i].length) {
               continue;
             }
             if (board[i + x][j + y] == 1) {
                board[i][j] = -1;
                break;
             }
           }
            if (board[i][j] == -1) {
              break;
            }
         }
       }
     }
     int answer = 0;
     for (int[] ints : board) {
       for (int anInt : ints) {
         if (anInt == 0) {
           answer++;
         }
       }
     }
      return answer;
    }
}