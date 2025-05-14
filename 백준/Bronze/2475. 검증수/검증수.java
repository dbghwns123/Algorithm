import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int answer = 0;
    for (int i = 0; i < 5; i++) {
      int i1 = Integer.parseInt(st.nextToken());
      answer += (int) Math.pow(i1, 2);
    }
    System.out.println(answer % 10);
  }

}