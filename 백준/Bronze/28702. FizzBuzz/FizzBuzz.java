import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int answer = 0;
    for (int i = 0; i < 3; i++) {
      String s = br.readLine();
      if (!s.startsWith("F") && !s.startsWith("B")) {
        answer = Integer.parseInt(s) + 3 - i;
        break;
      }
    }
    if (answer % 3 == 0 && answer % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (answer % 3 == 0) {
      System.out.println("Fizz");
    } else if (answer % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(answer);
    }
  }

}