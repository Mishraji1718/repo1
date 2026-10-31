class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for(int num : nums){
            if(num<pivot){
                list1.add(num);
            }else if(num>pivot){
                list2.add(num);
            }else{
                list3.add(num);
            }
        }
        int index = 0;
        for(int i = 0;i<list1.size();i++){
            ans[index++] = list1.get(i);
        }
        for(int i = 0;i<list3.size();i++){
            ans[index++] = list3.get(i);
        }
        for(int i = 0;i<list2.size();i++){
            ans[index++] = list2.get(i);
        }
        return ans;
    }
}