class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for(int num : nums){
            sum = sum + num;
        }
        int sum2 = l*(l+1)/2;
        return sum2-sum;
    }
}