import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int count = Integer.parseInt(br.readLine());
    int[][] arr = new int[count][2];

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < count; i++) {
      int up = 1;
      for (int j = 0; j < count; j++) {
        if (i == j) {
          continue;
        } else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          up++;
        }
      }
      sb.append(up + " ");
    }
    System.out.println(sb);
  }
}