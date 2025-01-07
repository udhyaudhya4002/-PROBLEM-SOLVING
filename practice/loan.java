import java.util.Scanner;
class loan {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();
         System.out.println("Enter Loan amount");
         int loan = scan.nextInt();
        if (age<=25 || loan>=50000 ){
             System.out.println("You are eligible");
             
        }
        else{
             System.out.println("Not eligible");
             
        }
        if(loan<=50000){
            System.out.println("eligible");
        }
        else{
            System.out.println("max Amount is 50000");
        }
    }
}