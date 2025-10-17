class Solution {
    public int balancedStringSplit(String s) {
        int lcnt =0,res=0;
        for(char ch : s.toCharArray()){
            if(ch=='L'){
                lcnt++;
            }
            else{
                lcnt--;
            }
            if(lcnt==0){
                  res++;
            }
        }
        return res;
    }
}