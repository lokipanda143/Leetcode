class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revN = 0;
        while (x > revN) {
            int ld = x % 10;
            x = x / 10;
            if (revN > Integer.MAX_VALUE / 10 || (revN == Integer.MAX_VALUE / 10 && ld > Integer.MAX_VALUE % 10)) {
                return false;
            }

            revN = revN * 10 + ld;
        }
        return x == revN || x == revN / 10;
    }
}
