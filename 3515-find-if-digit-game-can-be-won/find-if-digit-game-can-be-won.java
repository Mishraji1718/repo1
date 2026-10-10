class Solution {
    public boolean canAliceWin(int[] nums) {
        int alicenumbersum1 = 0;
        int alicenumbersum2 = 0;
        int bobnumbersum1 = 0;
        int bobnumbersum2 = 0;
        for(int num : nums){
            if(num < 10){
                alicenumbersum1 = alicenumbersum1 + num;
            }else{
                alicenumbersum2 =  alicenumbersum2 + num;
            }
        }
        bobnumbersum1 = alicenumbersum2;
        bobnumbersum2 = alicenumbersum1;
        if(alicenumbersum1 > bobnumbersum1 || alicenumbersum2 > bobnumbersum2){
            return true;
        }
        return false;
    }
}