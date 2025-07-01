class Solution {
    public int possibleStringCount(String w) {
        int[] fre=new int[26];
        char ch[]=w.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
            fre[ch[i]-'a']++;
            }
        }
        int ans=1;
        for(int val: fre){
            if(val>=1){
                ans+=val;
            }
        }
    //    System.out.print(Arrays.toString(fre));
        return ans;
    }
}