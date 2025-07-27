/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize)
{
int i,j,k=0,c;

int* b = (int*)malloc(numsSize*sizeof(int));

for(i=0;i<numsSize;i++)
{c = 0;
for(j=0;j<numsSize;j++)
if(nums[i] > nums[j])
c++;
b[k++] = c;
}

*returnSize = k;
 return b;
}