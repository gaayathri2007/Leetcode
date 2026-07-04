class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> s = new TreeSet<>();
        
       int n = nums.length;
       for(int i=0; i< n; i++)
          s.add(nums[i]);
        
       for(int i=1; i<=n; i++)
         if(!s.contains(i))
           ans.add(i);

        return ans;
    }
}