/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* singleNumber(int* a, int n, int* returnSize) 
{
 int*b = malloc(2*sizeof(int));

int c, i, j, k=0;

    if (n == 2)
     { b[0] = a[0];
       b[1] = a[1];
     }

    else
     {
     for (i = 0; i < n; i++)
       {
         c = 0;
         for (j = 0; j < n; j++)
          {
             if (a[i] == a[j])
                 c++;
          }
          if (c == 1)
           b[k++] =  a[i];
    }
    }

    *returnSize = 2;
     return b;   
}