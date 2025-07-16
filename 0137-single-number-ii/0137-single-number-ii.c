int singleNumber(int* a, int n) 
{
    int i, j, c;

    if (n == 1)
        return a[0];

    for (i = 0; i < n; i++)
     {
        c = 0;
        for (j = 0; j < n; j++)
         {
            if (a[i] == a[j])
                c++;
        }
        if (c == 1)
            return a[i];
    }

    return 0;
}