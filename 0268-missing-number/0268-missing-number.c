int missingNumber(int* a, int n) 
{
  int i,sum=0,s=0;  
  
 for(i=0;i<=n;i++)
 sum = sum + i;
 
for(i=0;i<n;i++)
s = s + a[i];

return sum-s;
  
}