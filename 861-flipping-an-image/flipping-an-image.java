class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        for(int[] row : image){
            int low = 0;
            int high = n-1;
            while(low<=high){
                int t = row[low];
                row[low] = 1 - row[high];
                row[high] = 1 - t;
                low++;
                high--;
            }
        }
        return image; 
    }
}