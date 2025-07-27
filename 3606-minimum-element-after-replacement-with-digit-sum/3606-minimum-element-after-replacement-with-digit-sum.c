int minElement(int* nums, int numsSize) 
{
int i,s,r,min;

for(i=0;i<numsSize;i++)
{s=0;
while(nums[i] != 0)
{
r = nums[i] % 10;
s = s + r;
nums[i] /= 10;
}
nums[i] = s;
}

min = nums[0];
for(i=0;i<numsSize;i++)
if(nums[i] < min)
min = nums[i];

return min;
}