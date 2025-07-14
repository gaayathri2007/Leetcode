/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* pivotArray(int* a, int n, int pivot, int* returnSize)
 {
 int i,j=0;

 int *b = malloc(1000000*sizeof(int));

 for(i=0;i<n;i++)
   if(a[i] < pivot)
     b[j++] = a[i];
 
 for(i=0;i<n;i++)
   if(a[i] == pivot)
     b[j++] = a[i];

 for(i=0;i<n;i++)
   if(a[i] > pivot)   
    b[j++] = a[i];

*returnSize = j;
return b;
    
}