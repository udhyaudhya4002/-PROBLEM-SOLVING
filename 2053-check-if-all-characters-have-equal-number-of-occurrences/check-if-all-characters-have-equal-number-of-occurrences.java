class Solution {
    public boolean areOccurrencesEqual(String s) {
    boolean ans=true;
     int[] arr=new int[26];
     for(char c:s.toCharArray()){
        arr[c-'a']++;
        // System.out.print(arr[i]);
    }
    int pre=arr[s.charAt(0)-'a'];
    for(int f: arr){
        if( f != 0 && f!= pre)
        {
            return false;
        }
       
    }
    
    return true;

}
}