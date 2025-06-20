import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int cnt = Integer.parseInt(br.readLine());
    int[][] arr = new int[15][15];
    for (int i = 0; i < arr.length; i++) {
      arr[i][1] = 1;
      arr[0][i] = i;
    }

    for (int i = 1; i < arr.length; i++) {
      for (int j = 2; j < arr.length; j++) {
        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
      }
    }

    for (int i = 0; i < cnt; i++) {
      int i1 = Integer.parseInt(br.readLine());
      int i2 = Integer.parseInt(br.readLine());
      sb.append(arr[i1][i2] + "\n");
    }
    System.out.println(sb);
  }
}