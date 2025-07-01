class Solution {
    public String reversePrefix(String word, char ch) {
        int cnt=-1;
        char[] chr=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(chr[i]==ch){
                cnt=i;
                break;
            }
        }
        int l=0;
        while(l<cnt){
            char temp=chr[l];
            chr[l]=chr[cnt];
            chr[cnt]=temp;
            cnt--;
            l++;
        }
    return new String(chr);
    }
}