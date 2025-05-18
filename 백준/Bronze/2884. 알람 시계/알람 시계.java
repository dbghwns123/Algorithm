import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    LocalTime localTime = LocalTime.of(Integer.parseInt(st.nextToken()),
//        Integer.parseInt(st.nextToken())).minusMinutes(45);
//    System.out.println(localTime.getHour() + " " + localTime.getMinute());
    int hour = Integer.parseInt(st.nextToken());
    int minute = Integer.parseInt(st.nextToken());
    if (minute < 45) {
      if (hour == 0) {
        hour = 23;
      } else {
        hour--;
      }
      minute = 60 - (45 - minute);
    } else {
      minute -= 45;
    }
    System.out.println(hour + " " + minute);
  }

}