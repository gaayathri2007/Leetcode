/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* a, int n, int* returnSize) 
{
 int i,s=0,k=0;
 
 int *b = (int *)malloc(1000*sizeof(int));

 for(i=0;i<n;i++)
  {
    s+=a[i];
    b[k++] = s;
  }

  *returnSize = k;
  return b;

  }