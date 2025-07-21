int removeElement(int* nums, int numsSize, int val)
 {
 int c=0,i;
for(i=0;i<numsSize;i++)
 {
   if(nums[i]!=val)
    nums[c++]=nums[i];

 }

return c;
    
}