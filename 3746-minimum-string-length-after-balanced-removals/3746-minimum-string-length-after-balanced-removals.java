class Solution {
    public int minLengthAfterRemovals(String s) {
        int n = s.length();
        int ca = 0, cb = 0;
        for(int i=0; i<n; i++)
          if(s.charAt(i) == 'a')
            ca++;
          else if(s.charAt(i) == 'b')
            cb++;
        if(ca-cb < 0)
          return -(ca-cb);
        return ca-cb;
    }
}