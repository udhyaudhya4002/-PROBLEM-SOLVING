
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int time =scan.nextInt();
        if(time>=12&&time<=16){
            System.out.println("after noon");
        
        }
        else if(time>=16&&time<=19){
            System.out.println("evening");
        }
        else{
            System.out.println("morning");
        }





        
    }
}
