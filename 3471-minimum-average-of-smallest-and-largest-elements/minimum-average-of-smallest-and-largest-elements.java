class Solution {
    public double minimumAverage(int[] nums) {
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
        double min = Double.MAX_VALUE;
        for(int i = 0;i<n/2;i++){
            if(avg[i] < min){
                min = avg[i];
            }
        }
        return min;
    }
}