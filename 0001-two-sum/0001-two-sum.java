class Solution {
    public int[] twoSum(int[] nums, int target) {
     int N = nums.length;
     Map<Integer,Integer> map = new HashMap<>();

     for(int i=0; i<N; i++){
        int cpm = target - nums[i];
        if(map.containsKey(cpm))
        return new int[]{map.get(cpm),i};

        map.put(nums[i],i);
     }
     return new int[]{0,0};
    }
}