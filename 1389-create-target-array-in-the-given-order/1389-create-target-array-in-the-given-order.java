class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      List<Integer> l = new ArrayList<>();
      int N = index.length;
      int[] a = new int[N];

      for(int i=0; i<N; i++){
        l.add(index[i] ,nums[i]);
      }
      for(int i=0; i< l.size(); i++)
       a[i] = l.get(i);

      return a;
    }
}