class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int l = s.length();
        for(int i = 0;i<l;i++){
            int d = 123-s.charAt(i);
            int p = d*(i+1);
            sum = sum+p;
        }
        return sum;
    }
}