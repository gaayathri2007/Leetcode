bool isValid(char* s)
{
  int i,c=0,d=0,vow=0,cons=0,sym=0;

i=0;
while(s[i] != '\0')
{
c++;

if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U' )
 vow++;

else if((s[i] >= 'a' || s[i] >='A') && (s[i] <='z' || s[i] <= 'Z') && (s[i] != 'a' || s[i] != 'e' || s[i] != 'i' || s[i] != 'o' || s[i] != 'u' || s[i] != 'A' || s[i] != 'E' || s[i] != 'I' || s[i] != 'O' || s[i] != 'U' ))
cons++;

else if(s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' ||s[i] == '5' || s[i] == '6' || s[i] == '7' || s[i] == '8' || s[i] =='9')
d++;

else 
sym++;

i++;
}

 if(c < 3 || vow < 1 || cons < 1 || sym > 0)
   return false;
 else
   return true;

}