class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0;i<n;i++){
            leftsum = 0;
            rightsum = 0;
            for(int j = 0;j<i;j++){
                leftsum = leftsum + nums[j];
            }
            for(int j = i+1;j<n;j++){
                rightsum = rightsum + nums[j];
            }
            ans[i] = Math.abs(leftsum-rightsum);
        }
        return ans;
    }
}