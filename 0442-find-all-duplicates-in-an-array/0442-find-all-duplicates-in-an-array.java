class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++)
          if(!s.add(nums[i]))
        l.add(nums[i]);
        return l;
    }
}