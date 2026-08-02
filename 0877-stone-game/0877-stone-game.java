class Solution {
    public boolean stoneGame(int[] piles) {
    return true;

    // Time limit exceeded 
    //     int N = piles.length;
    //     int s = 0;
    //     for(int i=0; i<N; i++)
    //     s += piles[i];

    //     int a_score = solve(piles, 0, N-1);

    //     return a_score > s/2;
    // }
    // int solve(int[] piles, int i, int j){
    //     if(i > j)
    //     return 0;

    //     int take_i = piles[i] + Math.min(solve(piles, i+2, j), solve(piles, i+1, j-1));

    //     int take_j = piles[j] + Math.min(solve(piles, i+1, j-1), solve(piles, i,j-2));

    //     return Math.max(take_i, take_j);
    
    }
}