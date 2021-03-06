package palindromnumber;

class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        for (int i = 0; i < num.length(); ++i) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) return false;
        }
        return true;
    }

    public boolean isPalindromeOptimized(int x) {
        if (x < 0) return false;

        int org = x;
        int rem;
        int rev = 0;
        while (x != 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }

        return (org == rev);
    }
}
