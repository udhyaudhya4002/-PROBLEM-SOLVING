class Solution {
    public String defangIPaddr(String add) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<add.length();i++){
        if(add.charAt(i)!='.'){
          str.append(add.charAt(i));
          }
          else{
            str.append("[");
            str.append(add.charAt(i));
            str.append("]");
          }
        }
        return str.toString();
    }
}