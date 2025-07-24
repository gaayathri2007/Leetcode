bool isMonotonic(int* a, int n) 
{
    int i, increasing = 1, decreasing = 1;

    for (i = 0; i < n - 1; i++) 
    {
        if (a[i] > a[i + 1])
            increasing = 0;

        else if (a[i] < a[i + 1])
            decreasing = 0;
    }
    return increasing || decreasing;
}
