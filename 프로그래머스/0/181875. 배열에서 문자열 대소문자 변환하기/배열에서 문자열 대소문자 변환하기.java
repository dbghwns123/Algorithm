class Solution {
    public String[] solution(String[] strArr) {
        String[] arr = new String[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = strArr[i].toLowerCase();
      } else {
        arr[i] = strArr[i].toUpperCase();
      } 
    }
    return arr;
    }
}