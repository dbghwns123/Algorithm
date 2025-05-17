import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    int answer = 0;
    for (byte aByte : br.readLine().getBytes()) {
      answer += aByte - '0';
    }
    System.out.println(answer);
  }

}