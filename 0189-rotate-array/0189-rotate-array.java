class Solution {
    public void rotate(int[] nums, int k) {
        int N = nums.length;

        List<Integer> l = new ArrayList<>();
        for(int i=0; i<N; i++)
        l.add(nums[i]);

        Collections.rotate(l,k);

        for(int i=0; i<N; i++)
        nums[i] = l.get(i);

    }
}