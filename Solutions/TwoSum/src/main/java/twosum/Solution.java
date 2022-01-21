package twosum;

class Solution {
    public Solution() {}

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            if (i > target) continue;
            for (int j = i + 1; j < nums.length; ++j) {
                if (j > target) continue;
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }

    public int[] twoSumOptimized(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < nums.length) {
            if (!(left == right) && nums[left] + nums[right] == target) return new int[]{left, right};
            if (nums[left] + nums[right] > target) {
                --right;
            } else {
                ++left;
            }
        }
        return new int[]{-1, -1};
    }
}