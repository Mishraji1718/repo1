class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int row = n;
        int col = n;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        int total = n*n;
        int count = 0;
        int e = 1;
        while(left<=right && top<=bottom){
            for(int i = left;i<=right;i++){
                mat[top][i] = e;
                e++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                mat[i][right] = e;
                e++;
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    mat[bottom][i] = e;
                    e++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    mat[i][left] = e;
                    e++;
                }
                left++;
            }
        }
        return mat;
    }
}