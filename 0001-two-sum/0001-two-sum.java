class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int n1=0, n2=0;
        for(int i=0; i<N; i++)
        for(int j=i+1; j<N; j++)
        if(nums[i] + nums[j] ==  target){
            n1 = i;
            n2 = j;
            break;
        }
        return new int[]{n1, n2};
    }
}