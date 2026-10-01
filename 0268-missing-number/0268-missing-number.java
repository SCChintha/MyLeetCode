class Solution {
    public int missingNumber(int[] nums) {
        // Intuition: after sorting, nums[i] should equal i
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) return i;
        }
        return n;
    }
}