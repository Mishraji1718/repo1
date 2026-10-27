class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int d = m+n-1;
        int[][] ans = new int[m][n];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int key = i-j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        for(List<Integer> list : map.values()){
            Collections.sort(list);
        }
        Map<Integer,Integer> pos = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int key = i-j;
                
                int index = pos.getOrDefault(key,0);

                ans[i][j] = map.get(key).get(index);

                pos.put(key,index+1);
            }
        }
        return ans;
    }
}