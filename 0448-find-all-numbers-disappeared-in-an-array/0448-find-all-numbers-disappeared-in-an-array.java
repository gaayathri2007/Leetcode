class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans=new ArrayList<>();
        int N=nums.length;
        for(int i=0;i<N;i++)
        {
            int ind=Math.abs(nums[i])-1;

            if(nums[ind]>0)
                nums[ind]=-nums[ind];
        }

        for(int i=0;i<N;i++)
        {
            if(nums[i]>0)
                ans.add(i+1);
        }

        return ans;
        
    }
}