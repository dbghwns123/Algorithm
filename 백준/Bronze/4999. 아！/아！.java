import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String me = String.valueOf(br.readLine());
    String doctor = String.valueOf(br.readLine());
    if (me.length() < doctor.length()) {
      System.out.println("no");
    } else {
      System.out.println("go");
    }
  }
}