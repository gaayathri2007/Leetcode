class Solution {
    public int[] shuffle(int[] nums, int n) {
        int N = nums.length;

        List<Integer> l = new ArrayList<>();

        // List<Integer> fl = new ArrayList<>();
        // List<Integer> sl = new ArrayList<>();


        // for(int i=0; i<N/2; i++)
        // fl.add(nums[i]);

        // for(int i=N/2; i<N; i++)
        // sl.add(nums[i]);

        // System.out.println(fl);  
        // System.out.println(sl);  

        int j = n;
        for(int i=0; i<N/2; i++){
            l.add(nums[i]);
            l.add(nums[j++]);
        }
        System.out.println(l);

        int[] b = new int[N];

        for(int i=0; i<N; i++)
        b[i] = l.get(i);


        return b;

    }
}