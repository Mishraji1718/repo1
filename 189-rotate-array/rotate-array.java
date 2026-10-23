class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        // int i = 0;
        // while(k!=0){
        //     int temp = nums[n-1];
        //     for(i = n-1;i>0;i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[i] = temp;
        //     k--;
        // }
    }

    public void reverse(int [] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;

        }
    }
}