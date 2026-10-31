class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        for(int[] row : nums){
            Arrays.sort(row);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<m;j++){
                if(nums[j][i] > max){
                    max = nums[j][i];
                }
            }
            ans += max;
        }
        return ans;
    }
}