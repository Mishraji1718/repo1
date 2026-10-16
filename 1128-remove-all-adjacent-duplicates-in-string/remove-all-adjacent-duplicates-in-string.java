class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    if(st.peek() == ch){
                        st.pop();
                    }else{
                        st.push(ch);
                    }
                }
            }
        }
        while(st.size()>0){
            st1.push(st.pop());
        }
        while(st1.size()>0){
            sb.append(st1.pop());
        }
        return sb.toString();
    }
}