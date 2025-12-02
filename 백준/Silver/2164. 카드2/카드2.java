import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {
    Queue<Integer> queue = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      queue.add(i);
    }

    while (queue.size() != 1) {
      queue.poll();
      if (queue.size() == 1) {
        System.out.println(queue.peek());
        return;
      }
      queue.add(queue.poll());
    }
    System.out.println(queue.peek());
  }

}