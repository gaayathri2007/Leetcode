int countCompleteDayPairs(int* hours, int hoursSize)
 {
    int i, j, c;

    for (i = 0; i < hoursSize; i++)
        for (j = 0; j < i; j++)
            if ((hours[i] + hours[j]) % 24 == 0)
                c++;

    return c;
}