int addDigits(int num)
 {
if(num<=9)
return num;

int s,r;
do
{
  s = 0;
  while(num)
  {
    r = num%10;
    s = s + r;
    num = num/10;
  }
  num = s;
}while(s>9);

return s;


    
}