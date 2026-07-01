class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1])
                l.add(nums[i]);
        }
        return l;
    }
}