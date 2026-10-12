class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int prev = Integer.MIN_VALUE;
        int count1 = 0;
        for(int num : nums1){
            if(prev != num){
                nums1[count1] = num;
                prev = num;
                count1++;
            }
        }
        int count2 = 0;
        prev = Integer.MIN_VALUE;
        for(int num : nums2){
            if(prev != num){
                nums2[count2] = num;
                prev = num;
                count2++;
            }
        }
        
        for(int i = 0;i<count1;i++){
            for(int j = 0;j<count2;j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}