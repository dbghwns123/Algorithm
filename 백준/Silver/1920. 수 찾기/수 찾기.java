import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    int N1 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < N1; i++) {
      sb.append(binarySearch(arr, Integer.parseInt(st.nextToken()))).append("\n");
    }
    System.out.println(sb);


  }

  private static int binarySearch(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

      int mid = (low + high) / 2;

      if (key < arr[mid]) {
        high = mid - 1;
      } else if (key > arr[mid]) {
        low = mid + 1;
      } else {
        return 1;
      }
    }
    return 0;
  }

}