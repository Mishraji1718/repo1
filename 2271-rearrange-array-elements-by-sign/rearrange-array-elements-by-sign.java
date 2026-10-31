class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int index1 = 0;
        int index2 = 0;
        for(int num : nums){
            if(num>0){
                pos[index1] = num;
                index1++;
            }
            if(num<0){
                neg[index2++] = num;
            }
        }
        int index = 0;
        for(int i = 0;i<n/2;i++){
            ans[index++] = pos[i];
            ans[index++] = neg[i];
        }
        return ans;
    }
}