int alternateDigitSum(int n)
 {
    int m, r, c = 0, s = 0;

    m = n;
    while (m != 0)
     {
        c++;
        m /= 10;
    }

    m = n;
    while (m != 0)
     {
        r = m % 10;
        if (c % 2 != 0)
            s = s + r;
        else
            s = s - r;
        m /= 10;
        c--;
    }
    return s;
}