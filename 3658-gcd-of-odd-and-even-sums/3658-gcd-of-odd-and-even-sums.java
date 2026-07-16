class Solution {
    public int gcdOfOddEvenSums(int n) {
        int c1=0, c2=0, s1=0, s2= 0;
        int gcd = 1, num, i , j;
        
        i=1;
        while(true){
            s1 += i;
            i+=2;
            c1++;
            if(c1 == n)
            break;
        }
        
        j = 2;
        while(true){
            s2 += j;
            j+=2;
            c2++;
            if(c2 == n)
            break;
        }
        

        if(s1 <= s2)
          num = s1;
        else
          num = s2;


        for(i=1; i<=num/2; i++)
        if(s1 % i == 0 && s2 % i == 0)
        gcd = i;

        return gcd;
    }
}