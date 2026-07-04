class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        int N=nums.length;
        for(int i=0;i<N;i++)
        {
            int ind=Math.abs(nums[i])-1;

            if(nums[ind]>0)
                nums[ind]=-nums[ind];
            else
            {
                dup=ind+1;
            }
        }
        int miss=-1;
        for(int i=0;i<N;i++)
        {
            if(nums[i]>0)
            {
                miss=i+1;
                break;
            }

        }

        return new int[]{dup,miss};


    }
}