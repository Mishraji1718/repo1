class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String s = strs[0];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            
            for(int j = 1;j<strs.length;j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}