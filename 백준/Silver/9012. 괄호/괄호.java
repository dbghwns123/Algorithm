import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int cnt = Integer.parseInt(br.readLine());
    for (int i = 0; i < cnt; i++) {
      sb.append(solve(br.readLine()));
    }
    System.out.println(sb);
  }

  public static String solve(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else if (stack.isEmpty()) {
        return "NO\n";
      } else {
        stack.pop();
      }
    }
    return stack.isEmpty() ? "YES\n" : "NO\n";
  }

}