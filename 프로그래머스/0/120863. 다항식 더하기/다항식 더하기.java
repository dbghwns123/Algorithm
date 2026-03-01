class Solution {
    public String solution(String polynomial) {
        int xSum = 0;
    int numSum = 0;

    String[] split = polynomial.split(" \\+ ");
    for (String s : split) {
      if (s.contains("x")) {
        String x = s.replace("x", "");
        if (x.equals("")) {
          xSum += 1;
        } else {
          xSum += Integer.parseInt(x);
        }
      } else {
        numSum += Integer.parseInt(s);
      }
    }

    if (xSum == 0) {
      return String.valueOf(numSum);
    } else if (numSum == 0) {
      if (xSum == 1) {
        return "x";
      } else {
        return xSum + "x";
      }
    } else {
      if (xSum == 1) {
        return "x + " + numSum;
      } else {
        return xSum + "x + " + numSum;
      }
    }
    }
}