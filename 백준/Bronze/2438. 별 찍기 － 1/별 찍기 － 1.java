import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= count; i++) {
      for (int j = i; j >= 1; j--) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}