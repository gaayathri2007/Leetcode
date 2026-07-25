class Solution {
    public int minimumChairs(String s) {
        int N = s.length();
        int c = 0, max = 0;
        for(int i=0; i<N; i++){
            if(s.charAt(i) == 'E')
             c++;
            else if(s.charAt(i) == 'L')
            c--;

            if(c > max)
            max = c;
        }
        return max;
    }
}