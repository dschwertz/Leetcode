package romantointeger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void example2() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void example3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void example1Optimized() {
        assertEquals(3, solution.romanToIntOptimized("III"));
    }

    @Test
    void example2Optimized() {
        assertEquals(58, solution.romanToIntOptimized("LVIII"));
    }

    @Test
    void example3Optimized() {
        assertEquals(1994, solution.romanToIntOptimized("MCMXCIV"));
    }
}
