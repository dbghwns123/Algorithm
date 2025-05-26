import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    int answer = 0;
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < cnt; i++) {
      if (isPrime(Integer.parseInt(st.nextToken()))) {
        answer++;
      }
    }
    System.out.println(answer);
  }

  public static boolean isPrime(int number) {
    if (number == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}