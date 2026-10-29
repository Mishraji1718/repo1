class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        int i = 0;
        int j = 0;
        for(i = 0;i<n;i++){
            for(j = 0;j<n;j++){
                if(i == j || i+j == n-1){
                    if(grid[i][j] == 0){
                        return false;
                    }
                }else{
                    if(grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}