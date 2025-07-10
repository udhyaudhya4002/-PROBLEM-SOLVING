class Solution {
    public String convertToTitle(int cn) {
        StringBuilder res=new StringBuilder();
        while(cn>0){
            cn--;
            res.append((char)(cn%26 +'A'));
            cn/=26;
        }
        return res.reverse().toString();
    }
}