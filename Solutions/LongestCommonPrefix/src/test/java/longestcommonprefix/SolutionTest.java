package longestcommonprefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example1() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void example2() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void example3() {
        assertEquals("", solution.longestCommonPrefix(new String[]{""}));
    }

    @Test
    void example4() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"",""}));
    }

    @Test
    void example5() {
        assertEquals("a", solution.longestCommonPrefix(new String[]{"ab","a"}));
    }

    @Test
    void example1Optimized() {
        assertEquals("fl", solution.longestCommonPrefixOptimized(new String[]{"flower","flow","flight"}));
    }

    @Test
    void example2Optimized() {
        assertEquals("", solution.longestCommonPrefixOptimized(new String[]{"dog","racecar","car"}));
    }

    @Test
    void example3Optimized() {
        assertEquals("", solution.longestCommonPrefixOptimized(new String[]{""}));
    }

    @Test
    void example4Optimized() {
        assertEquals("", solution.longestCommonPrefixOptimized(new String[]{"",""}));
    }

    @Test
    void example5Optimized() {
        assertEquals("a", solution.longestCommonPrefixOptimized(new String[]{"ab","a"}));
    }
}
