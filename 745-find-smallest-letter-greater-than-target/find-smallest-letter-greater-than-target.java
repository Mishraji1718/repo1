class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch1 = letters[0];
        for(char ch : letters){
            if(ch > target){
                return ch;
            }
        }
        return ch1;
    }
}