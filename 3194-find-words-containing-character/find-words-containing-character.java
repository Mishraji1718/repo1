class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for(String str : words){
            int count = 0;
            for(char ch : str.toCharArray()){
                if(ch == x){
                    count++;
                }
            }
            if(count>0){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}