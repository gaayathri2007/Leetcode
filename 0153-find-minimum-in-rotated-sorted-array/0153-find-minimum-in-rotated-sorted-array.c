int findMin(int* a, int n)
 {
    int i,min;

    min = a[0];
    for (i = 0; i < n; i++)
        if (a[i] < min)
            min = a[i];

    return min;
}