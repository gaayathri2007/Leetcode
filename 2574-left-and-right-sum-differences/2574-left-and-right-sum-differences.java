class Solution {
    public int[] leftRightDifference(int[] nums) {
        int N = nums.length;
        int[] l = new int[N];
        int[] r = new int[N];
        int[] ans = new int[N];

        l[0] = 0;
        for(int i=1; i<N; i++){
        int ls = 0;
            for(int j=0; j<i; j++){
                ls = ls+nums[j];
            }
            l[i] = ls;
        }

        for(int i=0; i<N; i++){
        int rs = 0;
            for(int j=i+1; j<N; j++){
                rs = rs+nums[j];
            }
            r[i] = rs;
        }

        for(int i=0; i<N; i++){
            ans[i] = Math.abs(l[i]-r[i]);
        }

        return ans;
    }
}