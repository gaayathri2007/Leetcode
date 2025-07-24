/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* transformArray(int* a, int n, int* returnSize) 
{
 int i,j,c,k=0;

int *b = (int *)malloc(n*sizeof(int));

for(i=0;i<n;i++)
{
 if(a[i] % 2 == 0)
 b[k++] = 0;
 else
 b[k++] = 1;
}

for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
 if(b[i] > b[j])
{
  c = b[i];
  b[i] = b[j];
  b[j] = c;
}

 *returnSize = k;
  return b;

}