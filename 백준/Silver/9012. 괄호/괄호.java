import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = sc.nextLine();
            arr[i] = str;
        }
        for (String s : arr) {
            System.out.println(solution(s));
        }
    }
    public static String solution(String str) {
        Stack<String> stack = new Stack<>();
        for (String s : str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else if (s.equals(")")) {
                if (stack.isEmpty()) {
                    return "NO";
                } else if (stack.peek().equals("(")) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}