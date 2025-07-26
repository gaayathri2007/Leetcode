int compare(const void* , const void*);
int maxProduct(int* a, int n) 
{
int i,j,c;

qsort(a,n,sizeof(int),compare);

return (a[n-1]-1)*(a[n-2]-1);
}

int compare(const void* a,const void* b)
{
return (*(int*)a - *(int*)b);
}
