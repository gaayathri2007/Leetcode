char* greatestLetter(char* word) {

    char *m = (char *)malloc(2*sizeof(char));

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

    for(i=25;i>=0;i--)
    {
        if(lower[i]==1 && upper[i]==1 )
        {
            m[0] = i + 'A';
            m[1] = '\0';
            return m;
        }
       
    }
    return "";

    
}