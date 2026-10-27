class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        int l1 = l/2;
        String s1 = s.substring(0,l1);
        String s2 = s.substring(l1);
        String vowel = "AEIOUaeiou";
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(vowel.indexOf(ch) != -1){
                count1++;
            }
        }
        for(int i = 0;i<s2.length();i++){
            char ch2 = s2.charAt(i);
            if(vowel.indexOf(ch2) != -1){
                count2++;
            }
        }
        return count1 == count2;
    }
}