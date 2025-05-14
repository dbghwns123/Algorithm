import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int i = Integer.parseInt(br.readLine());
    for (int j = 0; j < i; j++) {
      String s = br.readLine();
      sb.append(s.substring(0,1) + s.substring(s.length()-1) + "\n");
    }
    System.out.println(sb);
  }

}