import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int cnt = Integer.parseInt(br.readLine());

//    Arrays.sort 를 사용하지 않고 카운팅정렬을 사용하는 방법
//    시간복잡도는 O(N + K) 이다. K는 자릿수를 의미하는데 입력데이터가 K 보다 훨 씬 큰경우.
//    즉 데이터가 많으면 많을 수록 O(N) 에 가깝기 때문에 이상적으로는 O(N) 이라고 보아도 무방하다.

    // 수의 범위 (0 ~ 10000) 사실상 0은 제외
    int[] arr = new int[10001];

    for (int i = 0; i < cnt; i++) {
      arr[Integer.parseInt(br.readLine())]++;
    }

    br.close();

    for (int i = 1; i < 10001; i++) {
      while (arr[i] != 0) {
        sb.append(i).append("\n");
        arr[i]--;
      }
    }

    System.out.println(sb);


//    Arrays.sort() 를 사용하는 방식

//    Arrays.sort() 의 경우 dual-pivot Quick sort 알고리즘을 사용한다.
//    평균 O(nlogn) 의 시간복잡도를 보이지만 최악의 경우 O(n2) 로 좋지 않는 성능이 될 수도 있음

//    int[] arr = new int[cnt];
//    for (int i = 0; i < cnt; i++) {
//      arr[i] = Integer.parseInt(br.readLine());
//    }
//    Arrays.sort(arr);
//    for (int i : arr) {
//      sb.append(i + "\n");
//    }
//    System.out.println(sb);
  }
}