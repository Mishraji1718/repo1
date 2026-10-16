class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<=rowIndex;i++){
            int val = nCr(rowIndex,i);
            list.add(val);
        }
        return list;
    }
    public int nCr(int row,int col){
        long res = 1;
        for(int i = 0;i<col;i++){
            res = res * (row-i);
            res = res/(i+1);
        }
        return (int)res;
    }
}