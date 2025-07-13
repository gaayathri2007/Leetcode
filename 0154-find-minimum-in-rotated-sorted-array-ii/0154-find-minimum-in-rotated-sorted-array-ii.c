int findMin(int* nums, int numsSize)
 {
    int small, i;
    
    small = nums[0];
    for (i = 0; i < numsSize; i++) 
    {
        if (nums[i] < small)
            small = nums[i];
    }
    return small;
}