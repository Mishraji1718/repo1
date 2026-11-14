class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
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
            if(leftsum - rightsum == 0){
                return i;
            }
        }
        return ans;
    }
}