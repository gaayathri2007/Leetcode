class Solution {
    public int maxRotateFunction(int[] nums) {
        int N = nums.length;
        int li = N-1;
        long s=0, val=0, max=0;

        for(int i=0; i<N; i++){
            s += nums[i];
            val += nums[i] * i;
        }
        max = val;

        for(int i=0; i<N; i++){
            val = val - (nums[li] * (N-1)) + (s-nums[li]);
            if(val > max)
            max = val;
            li--;
        }
        return (int)max;
    }
}