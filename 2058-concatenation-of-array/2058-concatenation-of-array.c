/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* a, int n, int* returnSize)
{
int i,k=0;

int *b = (int *)malloc(2*n*sizeof(int));

for(i=0;i<n;i++)
  b[k++] = a[i];

 for(i=0;i<n;i++)
  b[k++] = a[i];
 
*returnSize = k;
return b;

}