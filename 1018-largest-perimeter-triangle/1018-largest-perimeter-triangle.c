int compare(const void* , const void* );
int largestPerimeter(int* a, int n) 
{
int i,j,c;

qsort(a,n,sizeof(int),compare);

for(i=n-1;i>=2;i--)
{
  if(a[i] < a[i-1] + a[i-2])
   return a[i] + a[i-1] + a[i-2];
}  

return 0;
}


int compare(const void* x, const void* y) 
{
    return (*(int*)x - *(int*)y);
}
