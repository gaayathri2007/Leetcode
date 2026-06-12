class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        a = a.replaceAll("[^a-z0-9]","");
        String b = new StringBuffer(a).reverse().toString();
        return a.equals(b);
    }
}