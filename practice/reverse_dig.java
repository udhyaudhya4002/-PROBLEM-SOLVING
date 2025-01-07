public class reverse_dig {
    public static void main(String[] args) {
        int n=123;
        int num=0;
        int rev=0;
      while(n>0){
        num=n%10;
        rev=rev*10+num;
        n=n/10;
      } System.out.print(rev); 
    } 
    
}
