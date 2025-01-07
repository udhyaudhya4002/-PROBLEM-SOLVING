import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value1");
        int num1=scan.nextInt();
        System.out.println("Enter value2");
        int num2=scan.nextInt();
        System.out.println("Enter operator");
        char ope=scan.next().charAt(0);

            switch(ope){
            case '+':
            int add=num1+num2;
            System.out.println(add);             
            break;
            case '-':
            int sub=num1-num2;
            System.out.println(sub);            
            break;
            case '*':
            int mul=num1*num2;
            System.out.println(mul);              
            break;
            case '/':
            int div=num1/num2;
            System.out.println(div);             
            break;
            default:
            System.out.println("Enter corractly");
            }
         

        
    }
    
}
