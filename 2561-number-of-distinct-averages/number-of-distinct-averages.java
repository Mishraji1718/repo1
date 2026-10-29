class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        double[] avg = new double[n/2];
        int low = 0;
        int high = n-1;
        int index = 0;
        while(low<high){
            avg[index++] = (double)(nums[low]+nums[high])/2;
            low++;high--;
        }
        Arrays.sort(avg);
        int count = 0;
        double prev = Double.MIN_VALUE;
        for(int i = 0;i<n/2;i++){
            if(avg[i] != prev){
                count++;
                prev = avg[i];
            }
        }
        return count;
    }
}