class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(Integer k : nums)
         if(!s.add(k))
          return true;

        return false;
    }
}