/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* a, int n, int* returnSize)
{
  int i,j,c;
  int *b = malloc(10000*sizeof(int));

for(i=0;i<n;i++)
b[i] = pow(a[i],2);

for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(b[i]> b[j])
{
 c=b[i];
 b[i]=b[j];
 b[j]=c;
}    
 *returnSize = n;
  return b;
}