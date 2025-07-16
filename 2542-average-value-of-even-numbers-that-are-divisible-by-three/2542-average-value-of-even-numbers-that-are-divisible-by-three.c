int averageValue(int* a, int n)
{
  int i,s=0,c=0;

for(i=0;i<n;i++)
if(a[i] % 6 == 0)
 {c++;
  s+=a[i];
 }
  if(c>0)
  return s/c;
  else
  return 0; 
}