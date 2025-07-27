/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* evenOddBit(int n, int* returnSize) 
{
long s,m;
int r,i,j,o=0,e=0;

int* b = (int*)malloc(2*sizeof(int));

j=0;
s=0;
while(n != 0)
{
r = n % 2;
s = s + r * pow(10,j++);
n = n / 2;
}
i=0;
while(s != 0)
{
r = s % 10;
if(r == 1)
  if(i%2 != 0)
    o++; 
  else 
    e++; 
i++;
s = s/10;    
}
 b[0] = e;
 b[1] = o;

*returnSize = 2;
 return b;
}