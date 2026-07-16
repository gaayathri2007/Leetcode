class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int N = candies.length;
        int max = candies[0];
        for(int i=1; i<N; i++)
          if(candies[i] > max)
           max = candies[i];
           
        for(int i=0; i<N; i++)
         if(candies[i] + extraCandies >= max)
         l.add(true);
         else
         l.add(false);

         return l;
    }
}