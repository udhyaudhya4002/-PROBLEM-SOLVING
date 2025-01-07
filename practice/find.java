import java.util.Scanner;
public class find{
        void evenorodd(int num){
             if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        

    }

    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter num");
        int number=scan.nextInt();
        find obj= new find();
        obj.evenorodd(number);




   
    }
}

   