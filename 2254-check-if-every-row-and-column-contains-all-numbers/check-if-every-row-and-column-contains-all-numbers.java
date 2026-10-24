class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        while(i<n){
            boolean[] seen = new boolean[n+1];
            for(int j = 0;j<n;j++){
                int num = matrix[i][j];
                if(seen[num]){
                    return false;
                }
                seen[num] = true;
            }
            i++;
        }
        i = 0;
        while(i<n){
            boolean[] seen = new boolean[n+1];
            for(int j = 0;j<n;j++){
                int num = matrix[j][i];
                if(seen[num]){
                    return false;
                }
                seen[num] = true;
            }
            i++;
        }
        return true;
    }
}