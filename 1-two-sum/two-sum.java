class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        // int x = nums[0];
        // int y = target-nums[0];
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //         res[0] = i;
        //         res[1] = j;
        //         break;
        //         }
        //     }
        // }
        // return res;
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length-1;
        // while(left<right){
        //     int sum = nums[left]+nums[right];
        //     if(sum == target){
        //         res[0] = left;
        //         res[1] = right;
        //         break;
        //     }
        //     else if(sum > target){
        //         right--;
        //     }else{
        //         left++;
        //     }
        // }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =  0;i<nums.length;i++){
            int curr = nums[i];
            int left = target - curr;
            if(map.containsKey(left)){
                res[0] = map.get(left);
                res[1] = i;
                return res;
            }
            map.put(curr,i);
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}