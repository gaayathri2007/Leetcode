/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* a, int n, int* returnSize)
 { 
 
  int *b = malloc(1000000*sizeof(int));
  int i,e = 0 , o = 1;
  for(i=0;i<n;i++)
  { 
    if(a[i] > 0)
    {
     b[e] = a[i];
        e+=2;
    }
   else
   {
    b[o] = a[i];
    o+=2;
   }
  }
  *returnSize = n;
  return b;
    
}