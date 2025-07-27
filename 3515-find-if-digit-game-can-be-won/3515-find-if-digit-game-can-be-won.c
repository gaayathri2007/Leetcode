bool canAliceWin(int* nums, int numsSize) 
{
int i,s1=0,s2=0;

for(i=0;i<numsSize;i++)
if(nums[i] < 10)
s1 += nums[i];
else
s2 += nums[i];

if(s1 == s2)
return false;

return true;
}