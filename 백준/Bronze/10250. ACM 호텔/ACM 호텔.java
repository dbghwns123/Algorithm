import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    int cnt = Integer.parseInt(br.readLine());
    for (int i = 0; i < cnt; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int H = Integer.parseInt(st.nextToken());
      st.nextToken();			// W 는 그냥 버린다.
      int N = Integer.parseInt(st.nextToken());

      if (N % H == 0) {
        sb.append((H * 100) + (N / H)).append('\n');

      } else {
        sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
      }
    }
    System.out.println(sb);
  }

}