class Solution {
    public String defangIPaddr(String add) {
        String str="";
        for(int i=0;i<add.length();i++){
        if(add.charAt(i)!='.'){
          str+=add.charAt(i);
          }
          else{
            str+="[";
            str+=add.charAt(i);
            str+="]";
          }
        }
        return str;
    }
}