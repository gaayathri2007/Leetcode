int search(int* a, int n, int target)
 {
    int i, f;

    f = -1;
    for (i = 0; i < n; i++)
        if (a[i] == target) 
        {
            f = i;
            break;
        }
    return f;
}