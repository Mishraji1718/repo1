class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > n/3){
                list.add(key);
            }
        }
        // List<Integer> list = new ArrayList<>();
        // int candidate = 0;
        // int count = 0;
        // for(int num : nums){
        //     if(count == 0){
        //         candidate = num;
        //     }
        //     if(num == candidate){
        //         count++;
        //     }else{
        //         count--;
        //     }
        //     if(count>n/2){
        //         list.add(candidate);
        //     }
        // }
        return list;
    }
}