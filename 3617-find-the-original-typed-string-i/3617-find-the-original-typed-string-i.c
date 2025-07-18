int possibleStringCount(char* s) 
{
 int i,n,c=0;
n=strlen(s);
for(i=0;i<n-1;i++)
if(s[i] == s[i+1])
 c++;

    
 return c+1;
}