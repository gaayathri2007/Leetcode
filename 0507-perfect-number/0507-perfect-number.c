bool checkPerfectNumber(int num)
 {
int s,i;
s=0;
for(i=1;i<=num/2;i++)
if(num%i==0)
s=s+i;

if(s==num)
return 1;
return 0;

}