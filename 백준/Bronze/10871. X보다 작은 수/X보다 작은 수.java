import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    StringBuilder sb = new StringBuilder();

    int count = Integer.parseInt(st.nextToken());
    int num = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < count; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (a < num) {
        sb.append(a + " ");
      }
    }
    System.out.println(sb);
  }

}