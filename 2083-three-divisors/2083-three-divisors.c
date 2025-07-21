bool isThree(int n) 
{
    int i, c = 0;

    for (i = 2; i <= n / 2; i++) 
    {
        if (n % i == 0)
            c++;
    }
    if (c == 1)
        return true;

    return false;
}