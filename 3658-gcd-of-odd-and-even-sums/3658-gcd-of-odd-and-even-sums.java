class Solution {
    public int gcdOfOddEvenSums(int n) {
        int gcd = 1, num;
        int se = n*(n+1);
        int so = n*n;

        if(se <= so)  // int num = Math.min(se,so);
        num = se;
        else
        num = so;

        for(int i=1; i<=num/2; i++)
        if(se % i == 0 && so % i == 0)
        gcd = i;

        return gcd;
    }
}