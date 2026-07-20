class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int N = words.length;
        List<String> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<N; i++)
          l.add(words[i]);

        for(int i=0; i<N; i++){
            if(l.get(i).contains(Character.toString(x)))
            ans.add(i);
        }
        return ans;
    }
}