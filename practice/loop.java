public class loop {
    public static void main(String[] args) {
       int n=2;
       int count=0;
       for(int i=5;i<=n;i++){
        if(n%i==0){
            count=count+1;
        }
       }
       if (count==2){
        System.out.println("The number is a prime number");
       }
       else{
        System.out.println("The number is not a prime number");
       }

  
    }
    
}
