class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0;
        for(int num : nums){
            arr[i] = num*num;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }
}