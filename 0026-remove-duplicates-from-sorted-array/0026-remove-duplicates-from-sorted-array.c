int removeDuplicates(int* a, int n) 
{
    int i, j, k, f;

    k = 0;
    for (i = 0; i < n; i++) 
    {
        f = 0;
        for (j = 0; j < k; j++)
            if (a[i] == a[j])
            {
                f = 1;
                break;
            }
        if (f == 0)
            a[k++] = a[i];
    }
    n = k;
    return k;
}