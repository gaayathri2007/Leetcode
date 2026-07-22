class Solution {
    public int findClosestNumber(int[] nums) {

        int N = nums.length;
        int[] ans = new int[N];

        for(int i=0; i<N; i++)
            ans[i] = Math.abs(nums[i]);

        int min = ans[0];
        for(int i=0; i<N; i++)
        if(ans[i] < min)
          min = ans[i];

        for(int i=0; i<N; i++)
         System.out.println(ans[i]);

        for(int i=0; i<N; i++){
        if(nums[i] == min)
        return min;
        }

         return -min;
    }
}