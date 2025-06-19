import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[Integer.parseInt(br.readLine())];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);
    double answer = 0;
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i] / (double) arr[arr.length - 1] * 100;
    }
    System.out.println(answer / arr.length);
  }

}