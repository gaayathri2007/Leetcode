double average(int* a, int n) 
{
int i,j,min,max,s=0,c=0;

max = a[0];
for(i=0;i<n;i++)
if(a[i] > max)
max = a[i];

min = a[0];
for(i=0;i<n;i++)
if(a[i] < min)
min = a[i];

for(i=0;i<n;i++)
if(a[i] != max && a[i] != min)
{
s += a[i];
c++;
}

return (double)s/c;
}