class Solution {
    public int reverseDegree(String s) {
        int fre[]=new int[26];
        for(char ch: s.toCharArray()){
           fre[ch-'a']++;
        }
        int res=0,itr=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int rev=26-(ch-'a'); 
            res+=rev*(i+1);
            // System.out.println(res);
        }

        return res;
    }
}