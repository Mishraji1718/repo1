class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] arr = new int[4];
        int index = 3;
        while(num1 != 0 || num2 != 0 || num3 != 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num3 % 10;
            int min = Math.min(d1,Math.min(d2,d3));
            arr[index] = min;
            index--;
            num1 = num1/10;
            num2 = num2/10;
            num3 = num3/10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<4;i++){
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}