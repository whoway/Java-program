class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] mybash = new int[100005];
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            mybash[nums[i]]++;
            if (mybash[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}