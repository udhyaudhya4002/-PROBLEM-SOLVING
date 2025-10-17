class Solution {
    public char findTheDifference(String s, String t) {
        int free[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            free[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            free[ch-'a']--;
        }
        char res=' ';
        for(int i=0;i<26;i++){
            if(free[i]!=0){
                return (char)(i+'a');
            }           
        }
        return ' ';
    }
}