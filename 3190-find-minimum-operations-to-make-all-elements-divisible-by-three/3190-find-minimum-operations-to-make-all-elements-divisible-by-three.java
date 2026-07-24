class Solution {
    public int minimumOperations(int[] nums) {
        int N = nums.length;
        int c = 0;
        for(int i=0; i<N; i++){
            if((nums[i] - 1) % 3 == 0)
            c++;
            else if((nums[i] + 1) % 3 == 0)
            c++;
        }
            return c;
    }
}