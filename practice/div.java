
import java.util.*;

public class div {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%3==0&&num%5==0){
            System.out.println("lol");
        }
        else if(num%3==0){
            System.out.println("hi");
        }else if(num%5==0){
            System.out.println("bey");
        }
        else{
            System.out.println("not divid bye 3 & 5");
        }

    }
    
}
