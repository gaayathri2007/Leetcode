int trailingZeroes(int n)
 {
    int c, m;
    c = 0;
    m = n;
    while (m >= 5)
     {
        m = m / 5;
        c = c + m;
    }
    return c;
}