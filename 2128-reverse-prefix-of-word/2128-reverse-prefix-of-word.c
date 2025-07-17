char* reversePrefix(char* s, char ch) 
{

int n,i,f,j=0;
char c;

n = strlen(s);

f = 0;

for(i=0;i<n;i++)
{
    if(s[i]==ch)
    {
        f = 1;
        break;
    }
}

if(f==0)
return s;

while(j<i)
{
    c = s[i];
    s[i] = s[j];
    s[j] = c;

    j++;
    i--;
}

return s;


}