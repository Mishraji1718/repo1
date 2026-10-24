class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((r*c)!=(m*n)) return mat;
        int[][] arr = new int[r][c];
        int[] a = new int[m*n];
        int v = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                a[v] = mat[i][j];
                v++;
            }
        }
        v = 0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = a[v];
                v++;
            }
        }
        return arr;
    }
}