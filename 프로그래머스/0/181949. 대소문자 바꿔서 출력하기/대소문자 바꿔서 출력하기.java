import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (String s : a.split("")) {
          if (s.equals(s.toLowerCase())) {
            System.out.print(s.toUpperCase());
          } else {
            System.out.print(s.toLowerCase());
          }
        }
    }
}