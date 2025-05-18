import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int rep = Integer.parseInt(st.nextToken());
      String s = st.nextToken();
      for (int j = 0; j < s.length(); j++) {
        for (int k = 0; k < rep; k++) {
          sb.append(s.charAt(j));
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}