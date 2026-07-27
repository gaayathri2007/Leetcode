class Solution {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        Arrays.sort(nums);
        return((nums[N-1]-1) * (nums[N-2]-1));
    }
}