int numberOfSpecialChars(char* word) {

    int upper[26] = {0};
    int lower[26] = {0};

    int i,c=0,n = strlen(word);

    for(i=0;i<n;i++)
    {
        if(word[i]>='a' && word[i]<='z')
        lower[word[i] - 97] = 1;

        else if(word[i]>='A' && word[i]<='Z')
        upper[word[i] - 65 ] = 1;
    }

    for(i=0;i<26;i++)
    {
        if(lower[i]==1 && upper[i]==1 )
        c++;
    }
    return c;
}