int maxProduct(int* a, int n) 
{
int big1,big2,i,j,c=0;

big1 = 0;
for(i=0;i<n;i++)
if(a[i] > big1)
big1 = a[i];

for(i=0;i<n;i++)
if(a[i] == big1)
c++;

if(c > 1)
big2 = big1;

else
{
for(i=0;i<n;i++)
if(a[i] < big1)
{
big2 = a[i];
break;
}

for(i=0;i<n;i++)
if(a[i] > big2 && a[i] < big1)
big2 = a[i];
}

return (big1-1)*(big2-1);
}