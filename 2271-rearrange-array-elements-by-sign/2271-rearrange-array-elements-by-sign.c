/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* a, int n, int* returnSize)
 {
  int c[n/2],d[n/2],k=0,l=0,j=0,i; 
 
  int *b = malloc(1000000*sizeof(int));

  for(i=0;i<n;i++)
  { 
    if(a[i] > 0)
     c[k++] = a[i];
   else
     d[l++] = a[i];
  }
k=0;l=0;
 for(i=0;i<n/2;i++)
 {     
    b[j++] = c[k++];
    b[j++] = d[l++];
 }
  
  *returnSize = j;
  return b;
    
}