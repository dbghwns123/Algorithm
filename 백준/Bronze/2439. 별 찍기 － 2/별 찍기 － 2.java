import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int i = Integer.parseInt(br.readLine());
    for (int j = 0; j < i; j++) {
      for (int k = i - 1; k >= 0; k--) {
        if (k <= j) {
          sb.append("*");
        } else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}
