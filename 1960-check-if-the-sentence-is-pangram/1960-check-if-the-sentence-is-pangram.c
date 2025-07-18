bool checkIfPangram(char* s) 
{
 int a[26]={0};
 int i,j,n,f;

n=strlen(s);
if(n<26)
 return false;

else
 {
 for(i=0;i<n;i++)
   if(s[i] >= 'a' && s[i] <= 'z')
     a[s[i]-97]++;

f=1;
for(i=0;i<26;i++)
  if(a[i] == 0)
  {
    f=0;
     break;
  }

}

if(f == 1)
  return true;

  return false;
}