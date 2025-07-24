/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getSneakyNumbers(int* a, int n, int* returnSize) 
{

   int i, j, k = 0, f, c;

    int* b = (int*)malloc(2 * sizeof(int));

    for (i = 0; i < n; i++) 
    {
        f = 0;
        for (j = 0; j < i; j++)
            if (a[i] == a[j]) 
            {
                f = 1;
                break;
            }
        if (f == 0) 
        {
            c = 0;
            for (j = i; j < n; j++)
                if (a[i] == a[j])
                    c++;
            if (c>1)
            b[k++] = a[i];
        }
    }

    *returnSize = k;
    return b;

}