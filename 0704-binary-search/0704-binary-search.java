class Solution {
    public int search(int[] nums, int target) {
        int N = nums.length;
        int l=0, r=N-1, ans = -1;
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid -1;
        }
        return ans;
    }
}