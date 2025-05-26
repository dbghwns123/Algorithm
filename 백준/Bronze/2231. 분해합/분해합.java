import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int length = s.length();
    int i = Integer.parseInt(s);
    int result = 0;

    for (int j = i - (9 * length); j < i; j++) {
      int number = j;
      int sum = j;
      while (number != 0) {
        sum += number % 10;
        number /= 10;
      }
      if (sum == i) {
        result = j;
        break;
      }
    }
    System.out.println(result);
  }

}