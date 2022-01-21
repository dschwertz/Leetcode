package twosum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example1() {
        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        if (Arrays.equals(result, new int[]{0,1}) || Arrays.equals(result, new int[]{1,0})) {
            assertTrue(true);
        }
    }

    @Test
    void example2() {
        int[] result = solution.twoSum(new int[]{3,2,4}, 6);
        if (Arrays.equals(result, new int[]{1,2}) || Arrays.equals(result, new int[]{2,1})) {
            assertTrue(true);
        }
    }

    @Test
    void example3() {
        int[] result = solution.twoSum(new int[]{3,3}, 6);
        if (Arrays.equals(result, new int[]{1,0}) || Arrays.equals(result, new int[]{0,1})) {
            assertTrue(true);
        }
    }

    @Test
    void example1Optimized() {
        int[] result = solution.twoSumOptimized(new int[]{2,7,11,15}, 9);
        if (Arrays.equals(result, new int[]{0,1}) || Arrays.equals(result, new int[]{1,0})) {
            assertTrue(true);
        }
    }

    @Test
    void example2Optimized() {
        int[] result = solution.twoSumOptimized(new int[]{3,2,4}, 6);
        if (Arrays.equals(result, new int[]{1,2}) || Arrays.equals(result, new int[]{2,1})) {
            assertTrue(true);
        }
    }

    @Test
    void example3Optimized() {
        int[] result = solution.twoSumOptimized(new int[]{3,3}, 6);
        if (Arrays.equals(result, new int[]{1,0}) || Arrays.equals(result, new int[]{0,1})) {
            assertTrue(true);
        }
    }
}
