int findGCD(int* a, int n) 
{
int i,small,large,gcd;

small = a[0];
large = a[0];

for(i=0;i<n;i++)
 if(a[i] < small)
   small = a[i];
else if(a[i] > large)
   large = a[i];

for(i=1;i<=small;i++)
 if(small % i == 0 && large % i == 0)
   gcd = i;

return gcd;
}