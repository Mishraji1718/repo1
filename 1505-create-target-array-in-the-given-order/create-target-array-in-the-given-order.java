class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<index.length;i++){
            int in = index[i];
            int val = nums[i];
            list.add(in,val);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}