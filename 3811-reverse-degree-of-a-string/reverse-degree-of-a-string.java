class Solution {
    public int reverseDegree(String s) {
       int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int reverseValue = 26 - (ch - 'a'); // position in reversed alphabet
            res += reverseValue * (i + 1);      // multiply by 1-indexed position
        }
        return res;
    }
}