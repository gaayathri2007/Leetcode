void sortColors(int* a, int n)
 {
    int i, j, c;

    for (i = 0; i < n - 1; i++)
        for (j = i + 1; j < n; j++)
            if (a[i] > a[j])
             {
                c = a[i];
                a[i] = a[j];
                a[j] = c;
            }
}
 