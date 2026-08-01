class Solution {
    public int minDistance(String word1, String word2) {
        int N1 = word1.length(), N2 = word2.length();
        int[][] dp = new int[N1+1][N2+1];
        int max = 0;

        for(int i=1; i<=N1; i++){
            for(int j=1; j<=N2; j++){
               if(word1.charAt(i-1) == word2.charAt(j-1))
                  dp[i][j] = dp[i-1][j-1] + 1;
               else
                 dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
        }
        }

        return(N1-dp[N1][N2] + N2 - dp[N1][N2]);
     }
}