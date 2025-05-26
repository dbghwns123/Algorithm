import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i = Integer.parseInt(br.readLine());
    int number = 1;
    int answer = 1;
    while (number < i) {
      number += 6 * answer;
      answer++;
    }
    System.out.println(answer);
  }

}