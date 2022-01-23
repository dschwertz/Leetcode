package validparentheses;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example1() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void example2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void example3() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void example4() {
        assertFalse(solution.isValid("([){[}]]"));
    }

    @Test
    void example5() {
        assertTrue(solution.isValid("({[]})"));
    }

    @Test
    void example6() {
        assertFalse(solution.isValid("("));
    }

    @Test
    void example7() {
        assertFalse(solution.isValid("]"));
    }
}
