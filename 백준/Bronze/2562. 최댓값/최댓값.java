import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    int max = -1;
    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      int i1 = Integer.parseInt(br.readLine());
      arr[i] = i1;
      if (i1 > max) {
        max = i1;
        idx = i + 1;
      }
    }
    System.out.println(max);
    System.out.println(idx);
  }

}