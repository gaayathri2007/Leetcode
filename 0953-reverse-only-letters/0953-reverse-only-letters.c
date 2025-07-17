char* reverseOnlyLetters(char* s) 
{
 int n,i,j; 
 char c;

n = strlen(s);

i=0;
j=n-1;
while(i<j)
{
 if(isalpha(s[i]) && isalpha(s[j]))   
   {
     c=s[i];
     s[i]=s[j];
     s[j]=c;
     i++;
     j--;
   }
  if(!isalpha(s[i]))
   i++;
   if(!isalpha(s[j]))
   j--;
}

  return s;
    
}