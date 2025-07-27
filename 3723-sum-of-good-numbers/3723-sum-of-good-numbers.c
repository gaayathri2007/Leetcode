int sumOfGoodNumbers(int* nums, int numsSize, int k)
{
int i,s=0;

for(i=0;i<numsSize;i++)
 if((i-k < 0 || nums[i-k] < nums[i])&&(i+k >= numsSize || nums[i+k] < nums[i]))

 {
  s += nums[i];
 } 
 return s;
}