class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // int i = 0;
        // int j = col-1;
        // while(i>=0 && i<row && j>=0 && j<col){
        //     if(matrix[i][j] == target){
        //         return true;
        //     }else if(target > matrix[i][j]){
        //         i++;
        //     } else{
        //         j--;
        //     }
        // }
        // return false;
        // boolean found = false;
        // for(int[] row : matrix){
        //     int low = 0;
        //     int high = col-1;
        //     while(low<high){
        //         int mid = low+(high-low)/2;
        //         if(row[mid] == target){
        //             found = true;
        //             break;
        //         } else if(row[mid]< target){
        //             low = mid+1;
        //         } else {
        //             high = mid-1;
        //         }
        //     }
        // }
        // return found;
        int low = 0;
        int high = (m*n)-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] < target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return false;
    }
}