class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer k : nums)
        map.merge(k,1,Integer::sum);

        for(Map.Entry<Integer, Integer> k : map.entrySet())
          if(k.getValue() > 1)
          return true;
          
        return false;
    }
}