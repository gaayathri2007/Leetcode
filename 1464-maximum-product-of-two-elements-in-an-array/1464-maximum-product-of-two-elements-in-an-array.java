class Solution {
    public int maxProduct(int[] nums) {
        // int N = nums.length;
        // Arrays.sort(nums);
        // return((nums[N-1]-1) * (nums[N-2]-1));
        int N = nums.length;
        int max = 0 , smax = 0;
        for(int i=0; i<N; i++){
            if(nums[i] > max){
                smax = max;
                max = nums[i];
            }
            else if(nums[i] >= smax)
            smax = nums[i];
        }
        return (max-1)*(smax-1);
    }
}