char* triangleType(int* t, int n) 
{
 int a,b,c;

a = t[0];
b = t[1];
c = t[2];

  if( a+b>c && b+c>a && c+a>b)
{
        if(a==b && b==c && c==a)
          return "equilateral";
        else if(a != b && b != c && c != a)
          return "scalene";
        else
          return "isosceles";
}
return "none";

}