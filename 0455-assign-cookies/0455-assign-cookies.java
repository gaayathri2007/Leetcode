class Solution { 
    public int findContentChildren(int[] g, int[] s) {
        // Arrays.sort(g);
        Arrays.sort(s);
        int gl = g.length;
        int sl = s.length;
        int c = 0;
        for(int i=0; i< gl; i++){
            for(int j=0;j<sl; j++){
                if(s[j] >= g[i]){
                    c++;
                    s[j] = 0;
                    break;
                }
            }
        }
        return c;
    }
}