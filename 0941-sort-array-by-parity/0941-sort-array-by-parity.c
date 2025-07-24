/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArrayByParity(int* a, int n, int* returnSize) 
{
int i,j,k=0;

int *b = (int *)malloc(n*sizeof(int));

for(i=0;i<n;i++)
if(a[i] % 2 == 0)
 b[k++] = a[i];

for(i=0;i<n;i++)
if(a[i] % 2 != 0)
 b[k++] = a[i];

*returnSize = k;
return b;
}