/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArrayByParityII(int* a, int n, int* returnSize) 
{
int i,k=0;

int *b = (int *)malloc(n*sizeof(int));

for(i=0;i<n;i++)
 if(a[i] % 2 == 0)
 {
   b[k] = a[i];
   k+=2;
 }
 
k=1;
for(i=0;i<n;i++)
 if(a[i] % 2 != 0)
 {
   b[k] = a[i];
   k+=2;
 } 

*returnSize = n;
 return b;
}