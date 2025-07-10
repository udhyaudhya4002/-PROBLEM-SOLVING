class Solution {
    public int titleToNumber(String ct) {
        int res=0;
        for(char c:ct.toCharArray()){
            res=res*26+(c-'A'+1);
        }
        return res;
    }
}