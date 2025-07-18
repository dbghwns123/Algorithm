import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String s = br.readLine();
      boolean check = true;
      if (s.equals("0")) {
        return;
      }
      for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
          check = false;
          break;
        }
      }
      if (check) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}