int arithmeticTriplets(int* nums, int numsSize, int diff)
 {
int i,j,k,c=0;

 for(i=0;i<numsSize;i++)
 for(j=i+1;j<numsSize;j++)
 for(k=j+1;k<numsSize;k++)
 if(i<j<k && nums[j]-nums[i] == diff && nums[k]-nums[j] == diff)
 c++;

 return c; 
}