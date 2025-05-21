import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int people = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[6];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine(), " ");
    int t = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    int tCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % t == 0) {
        tCount += arr[i] / t;
      } else {
        tCount += arr[i] / t + 1;
      }
    }
    sb.append(tCount + "\n");
    sb.append(people / p + " " + people % p);
    System.out.println(sb);
  }

}