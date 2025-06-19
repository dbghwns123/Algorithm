import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대 공약수, 최소 공배수
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(gcd(a, b));
    System.out.println(lcm(a, b));
  }

  // 반복문 방식 - 최대 공약수
//  public static int gcd(int a, int b) {
//    while (b != 0) {
//      int r = a % b;
//      a = b;
//      b = r;
//    }
//    return a;
//  }

  // 재귀 방식 - 최소 공배수
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  // 최소 공배수
  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}