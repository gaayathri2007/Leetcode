class Solution {
    public int distributeCandies(int[] candyType) {
        int N = candyType.length;
        int numC = N/2;

        Set<Integer> s = new HashSet<>();
        for(int i=0; i<N; i++)
        s.add(candyType[i]);

        if(numC <= s.size())
          return numC;
        else
          return s.size();

    }
}