bool judgeCircle(char* moves) 
{
int i,c1=0,c2=0,c3=0,c4=0;

i=0;
while(moves[i] != '\0')
{
if(moves[i] == 'U')
c1++;
if( moves[i] == 'D')
c2++;
if(moves[i] == 'L')
c3++;
if( moves[i] == 'R')
c4++;

i++;
}
if(c1 == c2 && c3 == c4)
return true;
else
return false;

return 0;
}