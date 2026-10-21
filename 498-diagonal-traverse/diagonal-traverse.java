class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int key = i+j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        int[] ans = new int[m*n];
        int index = 0;
        for(int d = 0;d<m+n-1;d++){
            List<Integer> list = map.get(d);

            if(d%2 == 0){
                Collections.reverse(list);
            }
            for(int num : list){
                ans[index] = num;
                index++;
            }
        }
        return ans;
    }
}