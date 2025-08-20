class Solution {
    public int solution(String binomial) {
        if (binomial.contains(" + ")) {
            int index = binomial.indexOf(" + ");
            String front = binomial.substring(0, index);
            Integer front1 = Integer.valueOf(front);
            String behind = binomial.substring(index + 3, binomial.length());
            Integer behind1 = Integer.valueOf(behind);
            return front1 + behind1;
        } else if (binomial.contains(" - ")) {
            int index = binomial.indexOf(" - ");
            String front = binomial.substring(0, index);
            Integer front1 = Integer.valueOf(front);
            String behind = binomial.substring(index + 3, binomial.length());
            Integer behind1 = Integer.valueOf(behind);
            return front1 - behind1;
        } else {
            int index = binomial.indexOf(" * ");
            String front = binomial.substring(0, index);
            Integer front1 = Integer.valueOf(front);
            String behind = binomial.substring(index + 3, binomial.length());
            Integer behind1 = Integer.valueOf(behind);
            return front1 * behind1;
        }
    }
}