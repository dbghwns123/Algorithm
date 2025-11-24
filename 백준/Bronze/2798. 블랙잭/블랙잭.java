import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int count = Integer.parseInt(st.nextToken());
    int sum = Integer.parseInt(st.nextToken());
    int answer = 0;
    st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < count - 2; i++) {
      if (arr[i] > sum) continue;
      for (int j = i + 1; j < count - 1; j++) {
        if (arr[i] + arr[j] > sum) continue;
        for (int k = j + 1; k < count; k++) {
          int sum1 = arr[i] + arr[j] + arr[k];
          if (sum1 == sum) {
            System.out.println(sum1);
            return;
          }
          if (sum1 > answer && sum1 < sum) {
            answer = sum1;
          }
        }
      }
    }
    System.out.println(answer);
  }

}