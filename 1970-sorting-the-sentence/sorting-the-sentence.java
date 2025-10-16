class Solution {
    public String sortSentence(String s) {
        String st[]=s.split(" ");
        String res[]=new String[s.length()];
        for(int i=0;i<st.length;i++){
               int pos = st[i].charAt(st[i].length() - 1) - '0';  
            
              res[pos - 1] = st[i].substring(0, st[i].length() - 1);

        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<st.length;i++){
              ans.append(res[i]);
              if(i<res.length-1) ans.append(" ");
              
        }

        return ans.toString().trim();
    }
}