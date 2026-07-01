class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int s = 0 , c = 0;

        for(int i=0; i < costs.length; i++)
        {
            if(s + costs[i] <= coins)
            {
                c++;
                coins = coins-costs[i];
            }
        }
        return c;
    }
}