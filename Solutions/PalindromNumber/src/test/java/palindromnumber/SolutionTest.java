package palindromnumber;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void example2() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void example3() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void example1Optimized() {
        assertTrue(solution.isPalindromeOptimized(121));
    }

    @Test
    void example2Optimized() {
        assertFalse(solution.isPalindromeOptimized(-121));
    }

    @Test
    void example3Optimized() {
        assertFalse(solution.isPalindromeOptimized(10));
    }
}
