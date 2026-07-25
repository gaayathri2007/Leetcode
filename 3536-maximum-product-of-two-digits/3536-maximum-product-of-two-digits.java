class Solution {
    public int maxProduct(int n) {
        int r,m;
        List<Integer> l = new ArrayList<>();
        m = n;
        while(m != 0){
            r = m % 10;
            l.add(r);
            m = m / 10;
        }
        l.sort((a,b)->Integer.compare(b,a));
        System.out.println(l);
        int  b1 = l.getFirst();
        l.remove(l.getFirst());
        int b2 = l.getFirst();

        return b1*b2;
    }
}