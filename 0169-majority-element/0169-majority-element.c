int majorityElement(int* a, int n) 
{
  int i,j,f,c,me;

  for(i=0;i<n;i++)
  { f=0;
    for(j=0;j<i;j++)
    if(a[i]==a[j])
    {
      f=1;
      break;
    }
  if(f==0)
  {
    c=0;
    for(j=i;j<n;j++)
    if(a[i]==a[j])
    c++;
  if(c>n/2)
  {me=a[i];
   break;
  }
  }
 }    
  return me;   
}