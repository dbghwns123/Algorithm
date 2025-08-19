class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
      return 1;
    } else if (arr1.length < arr2.length) {
      return -1;
    } else {
      int arr1_length = 0;
      int arr2_length = 0;
      for (int i : arr1) {
        arr1_length += i;
      }
      for (int i : arr2) {
        arr2_length += i;
      }
      if (arr1_length > arr2_length) {
        return 1;
      } else if (arr1_length < arr2_length) {
        return -1;
      } else {
        return 0;
      } 
    }
    }
}