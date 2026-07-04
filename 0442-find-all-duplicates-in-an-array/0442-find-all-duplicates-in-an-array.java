class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int N = nums.length;
        for(int i=0; i<N; i++)
        {
            int ind = Math.abs(nums[i])-1;

            if(nums[ind] > 0)
              nums[ind] = - nums[ind];
            else
              res.add(ind+1);
        }
        return res;
    }
}