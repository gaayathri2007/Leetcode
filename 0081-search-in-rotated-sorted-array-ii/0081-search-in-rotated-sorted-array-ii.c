bool search(int* a, int n, int target)
 {
     int i, f;

    f = 0;
    for (i = 0; i < n; i++)
        if (a[i] == target) 
        {
            f = 1;
            break;
        }
     if(f == 1)   
     return true;
     else return false;
}