class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String str : operations){
            if(str.equals("+")){
                int v1 = st.pop();
                int v2 = st.pop();
                int v = v1+v2;
                st.push(v2);
                st.push(v1);
                st.push(v);
            } else if(str.equals("D")){
                int v = st.pop();
                st.push(v);
                st.push(2*v);
            } else if(str.equals("C")) {
                st.pop();
            } else {
                int val = Integer.parseInt(str);
                st.push(val);
            }
        }
        if(st.isEmpty()) return 0;
        while(st.size()>0){
            sum = sum + st.pop();
        }
        return sum;
    }
}