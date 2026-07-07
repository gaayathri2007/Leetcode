class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for(Integer k : arr)
        map.merge(k,1,Integer::sum);

        for(Map.Entry<Integer, Integer> k : map.entrySet())
          if(!s.add(k.getValue()))
            return false;
        
        return true;
    }
}