class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int  c;

        for(int i=0; i<n; i++){
          c = 0;
        for(int j=0; j<n; j++)
        {
            if(s.charAt(i) == s.charAt(j))
            c++;
            if(c > 1)
             break;
        }
        if(c == 1)
            return i;
        
        }
        return -1;
    }
}