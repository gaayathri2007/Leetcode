int commonFactors(int a, int b) 
{
  int c,d,i,count=0;

c =fmin(a,b);
d =fmax(a,b);

for(i=1;i<=c/2;i++)
  {
    if(c%i == 0 && d%i == 0)
      count++; 
  }
  
if(d % c == 0)
  count++;

return count;   
}