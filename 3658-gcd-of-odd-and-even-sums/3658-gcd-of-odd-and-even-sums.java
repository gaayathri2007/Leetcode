class Solution {
    public int gcdOfOddEvenSums(int n) {
        int gcd = 1;
        int se = n*(n+1);
        int so = n*n;
        int num = Math.min(se,so);
        for(int i=1; i<=num/2; i++)
        if(se % i == 0 && so % i == 0)
        gcd = i;

        return gcd;
    }
}