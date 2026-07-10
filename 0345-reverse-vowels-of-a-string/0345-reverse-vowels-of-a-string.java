class Solution {
    public boolean isVowel(char d){
        char ch = Character.toLowerCase(d);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char arr[] = s.toCharArray();

        while(left < right){
            if(!isVowel(arr[left])){
                left++;
               continue;
            }
            if(!isVowel(arr[right])){
                right--;
                continue;
            }
            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;

            left++;
            right--;
        }
        return new String(arr);
    }
}