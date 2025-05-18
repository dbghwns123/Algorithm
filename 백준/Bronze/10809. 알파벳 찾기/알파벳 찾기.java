import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      sb.append(s.indexOf((char) ('a' + i)) + " ");
    }
    System.out.println(sb);
  }

}