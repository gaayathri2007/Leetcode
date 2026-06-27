class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        int i = 0, j = 0;

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        while(i < n1){
            if(s.charAt(i) != '#')
              s1.push(s.charAt(i));
            else
             {
                if(!s1.isEmpty())
                s1.pop();
             }
             i++;
        }

         while(j < n2){
            if(t.charAt(j) != '#')
              s2.push(t.charAt(j));
            else
             {
                if(!s2.isEmpty())
                s2.pop();
             }
             j++;
        }
        return s1.equals(s2);
    }
}