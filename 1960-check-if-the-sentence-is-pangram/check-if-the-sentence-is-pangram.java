class Solution {
    public boolean checkIfPangram(String sen) {
        int[] arr=new int[26];
        for(int i=0;i<sen.length();i++){
            int ind=sen.charAt(i)-'a';
            arr[ind]++;
        }
        for(int i=0;i<26;i++){
           if(arr[i]==0){
            return false;
           }
        }
        return true;
        
    }
}