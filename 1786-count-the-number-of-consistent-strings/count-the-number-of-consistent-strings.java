class Solution {
    public int countConsistentStrings(String al, String[] w) {
        int cnt=0;
        for(int i=0;i<w.length;i++){
            boolean b=true;
            for(int j=0;j<w[i].length();j++){
                if(!al.contains(String.valueOf(w[i].charAt(j)))){
                   b=false;
                   break;
                }
            }
            if (b) {
                cnt++;
            }
        }
        return cnt;
    }
}