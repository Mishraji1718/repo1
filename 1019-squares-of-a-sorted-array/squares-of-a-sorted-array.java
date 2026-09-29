class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        // int i = 0;
        // for(int num : nums){
        //     arr[i] = num*num;
        //     i++;
        // }
        // Arrays.sort(arr);
        // return arr;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int leftv = nums[low]*nums[low];
            int rightv = nums[high]*nums[high];
            if(leftv>rightv){
                arr[n-1] = leftv;
                low++;
                n--;
            }else{
                arr[n-1] = rightv;
                n--;
                high--;
            }
        }
        return arr;
    }
}