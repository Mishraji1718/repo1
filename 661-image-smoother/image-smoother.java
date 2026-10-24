class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int sum = img[i][j];
                int count = 1;
                if(j-1>=0){   // left check
                    sum += img[i][j-1];
                    count++;
                }
                if(j+1<n){    //right check
                    sum += img[i][j+1];
                    count++;
                }
                if(i-1>=0){    // top check;
                    sum += img[i-1][j];
                    count++;
                }
                if(i+1<m){    //bottom check
                    sum += img[i+1][j];
                    count++;
                }
                if(i-1>=0 && j-1>=0){ // top-left
                    sum += img[i-1][j-1];
                    count++;
                }
                if(i-1>=0 && j+1<n){  //top-right
                    sum += img[i-1][j+1];
                    count++;
                }
                if(i+1<m && j-1>=0){    //bottom-left
                    sum += img[i+1][j-1];
                    count++;
                }
                if(i+1<m && j+1<n){      //bottom-right
                    sum += img[i+1][j+1];
                    count++;
                }
                arr[i][j] = sum/count;
            }
        }
        return arr;
    }
}