import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());
    int[] arr = new int[count];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < count; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int a = Integer.parseInt(br.readLine());
    int answer = 0;
    
    for (int i : arr) {
      if (i == a) {
        answer++;
      }
    }
    System.out.println(answer);
  }

}