class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i  = 0;i<n;i++){
            int leftsum = 0;
            for(int j = 0;j<i;j++){
                leftsum = leftsum + nums[j];
            }
            int rightsum = 0;
            for(int m = i+1;m<n;m++){
                rightsum += nums[m];
            }
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}