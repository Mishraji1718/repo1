class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int co = 0;
        for(int num : nums){
            if(co == 0){
                c = num;
            }
            if(c == num){
                co++;
            }else{
                co--;
            }
        }
        return c;
    }
}