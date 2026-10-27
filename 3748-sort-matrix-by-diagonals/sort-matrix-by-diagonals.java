class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        int d = m+n-1;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int key = i-j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            List<Integer> list = entry.getValue();
            if(key >= 0){
                Collections.sort(list,Collections.reverseOrder());
            }else {
                Collections.sort(list);
            }
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