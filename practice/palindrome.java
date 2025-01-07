class palindrome {
        String org=s.toLowerCase();
    public boolean isPalindrome() {
        String s="A man, a plan, a canal: Panama";

        org=org.replaceAll("A-Za-z","");
        String reverse="";
        for(int i=org.length()-1;i>=0;i--){
            reverse+=org.charAt(i);
        }
        if(org.equals(reverse)){
                 return true;
                 
                 }
        else{
                  return false;
                  
                  }

     }       
  
}

