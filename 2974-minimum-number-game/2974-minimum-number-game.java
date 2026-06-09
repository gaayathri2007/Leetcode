class Solution {
    public int[] numberGame(int[] nums) {
       int n = nums.length;
       for(int i=0; i<n-1; i++)
        for(int j = i+1; j<n; j++)
          if(nums[i] > nums[j]){
            int c = nums[i];
            nums[i] = nums[j];
            nums[j] = c;
          }

       int l,m,i;
       int arr[] = new int[n];
       for(i=0; i<n-1; i+=2){
         arr[i+1] = nums[i];
         arr[i] = nums[i+1]; 
       }
        return arr;
    }
}