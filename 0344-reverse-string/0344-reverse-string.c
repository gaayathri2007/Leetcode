void reverseString(char* s, int n)
{
  int i,j,c;

 j=n-1;
 for(i=0;i<n/2;i++)
 {
   c=s[i];
   s[i]=s[j];
   s[j]=c;
   j--;
 }
 

}