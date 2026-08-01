class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int N1 = nums1.length;
        int N2 = nums2.length;
        int max = 0;
        int[][] dp = new int[N1+1][N2+1];

        for(int i=1; i<=N1; i++){
            for(int j=1; j<=N2; j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}