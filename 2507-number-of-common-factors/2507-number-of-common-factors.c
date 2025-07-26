int commonFactors(int a, int b) 
{
    int i, c = 0;

    for (i = 1; i <= 1000; i++)
        if (a % i == 0 && b % i == 0)
            c++;

    return c;
}