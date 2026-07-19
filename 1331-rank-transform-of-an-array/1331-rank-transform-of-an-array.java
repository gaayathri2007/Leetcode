class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int N = arr.length;
        int[] b = new int[N];
        int[] c = new int[N];

        for (int i = 0; i < N; i++)
            b[i] = arr[i];

        Arrays.sort(b);

        for (int i = 0; i < N; i++)
            System.out.println(b[i]);

        Map<Integer, Integer> map = new HashMap<>();
        int j = 1;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(b[i])) {
                map.put(b[i], j++);
            }

        }
        for (int i = 0; i < N; i++)
            c[i] = map.get(arr[i]);

        return c;
    }
}