int singleNumber(int* nums, int numsSize) {
    int i,c,j;
    
    if(numsSize==1)
    return nums[0];

    for(i=0;i<numsSize;i++)
    {
        c = 0;
        for(j=0;j<numsSize;j++)
        {
            if(nums[i]==nums[j])
            c++;
        }
        if(c==1)
        return nums[i];
    }
    return 0;
}