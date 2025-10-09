class Solution {
    public String restoreString(String s, int[] ind) {
        char arr[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ind[i]]=ch;
        }
        String st="";
        for(int i=0;i<s.length();i++){
            st+=arr[i];
        }
        return st;
        
    }
}