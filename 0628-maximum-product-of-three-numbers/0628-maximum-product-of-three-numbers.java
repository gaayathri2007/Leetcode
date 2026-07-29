class Solution {
    public int maximumProduct(int[] nums) {
       int N = nums.length;

       if(N == 3)
       return nums[0]*nums[1]*nums[2];

       int fb = Integer.MIN_VALUE;
       int sb = Integer.MIN_VALUE;
       int tb = Integer.MIN_VALUE;
       int fs = Integer.MAX_VALUE;
       int ss = Integer.MAX_VALUE;

       for(int i=0; i<N; i++){
        if(nums[i] > fb){
            tb = sb;
            sb = fb;
            fb = nums[i];
        }
        else if(nums[i] > sb){
            tb = sb;
            sb = nums[i];
        }
        else if(nums[i] > tb){
            tb = nums[i];
        }
        if(nums[i] < fs){
            ss = fs;
            fs = nums[i];
        }
        else if(nums[i] < ss)
        ss = nums[i];
       }
      // System.out.println(fb+"\t"+sb+"\t"+tb+"\t"+fs+"\t"+ss);
       return Math.max(tb*sb*fb,fb*fs*ss);
    }
}