class Solution {
    public long solution(String numbers) {
        String[] numStrs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine" };
        for (int i = 0; i < numStrs.length; i++) {
          numbers = numbers.replaceAll(numStrs[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}